import java.io.*;
import org.antlr.v4.runtime.*;

public class Micro {

	public static void main(String[] args) throws Exception{
		ANTLRFileStream file = new ANTLRFileStream(args[0]);
		Lexer lexer = new MicroLexer(( CharStream)file);
		Token token = lexer.getToken();
		token = lexer.nextToken();
		int token_type;
		String[] source_name = args[0].split("\\.");

		PrintWriter writer = new PrintWriter("output/" + source_name[0] + ".out", "UTF-8");

		while (token.getType() != token.EOF){
			token_type = lexer.getType();
			if (token_type != 23){
				writer.println("Token Type: " + token_type2string(token_type));
				writer.println("Value: " + token.getText());
			}
			token = lexer.nextToken();
		}
		writer.close();
	}

	private static String[] token_names = {"OPERATOR", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", "COMMENT", "IDENTIFIER"};

	public static String token_type2string(int input){
		if (input >= 19 && input <= 24){
			return token_names[input - 19];
		} else {
			return "KEYWORD";
		}

	}

}
