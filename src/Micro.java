import java.io.*;
import org.antlr.v4.runtime.*;

public class Micro {

	public static void main(String[] args) throws Exception{
		ANTLRFileStream file = new ANTLRFileStream(args[0]);
		Lexer lexer = new MicroLexer((CharStream)file);
		Token token = lexer.getToken();
		token = lexer.nextToken();
		while (token.getType() != token.EOF){
			System.out.println(token.getText());
			token = lexer.nextToken();
		}
	}

}
