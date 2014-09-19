import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class Micro {

	public static void main(String[] args) throws Exception{
		ANTLRFileStream file = new ANTLRFileStream(args[0]);
		Lexer lexer = new MicroLexer(( CharStream)file);

		CommonTokenStream token_stream = new CommonTokenStream(lexer);

		ANTLRErrorStrategy es = new Error_handler();

		MicroParser parser = new MicroParser(token_stream);
		parser.setErrorHandler(es);

		try{
             		parser.program();
			System.out.println("Accepted");
		}catch(Exception e){
			System.out.println("Not accepted");
		}

	}

	public static class Error_handler extends DefaultErrorStrategy {

		@Override
		public void recover(Parser recognizer, RecognitionException e){
		}

		@Override
		public Token recoverInline(Parser recognizer){
			InputMismatchException e = null;
			throw new ParseCancellationException(e);
	 
		}
		
		/*@Override
		public void reportError(Parser recognizer, RecognitionException e){
			
		}*/
	}
}
