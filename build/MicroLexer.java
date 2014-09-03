// Generated from Micro.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, OPERATOR=19, INTLITERAL=20, FLOATLITERAL=21, STRINGLITERAL=22, 
		COMMENT=23, IDENTIFIERS=24, WS=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'WRITE'", "'PROGRAM'", "'WHILE'", "'READ'", "'END'", "'FUNCTION'", "'CONTINUE'", 
		"'ELSE'", "'ENDIF'", "'VOID'", "'BREAK'", "'FLOAT'", "'STRING'", "'IF'", 
		"'RETURN'", "'BEGIN'", "'INT'", "'ENDWHILE'", "OPERATOR", "INTLITERAL", 
		"FLOATLITERAL", "STRINGLITERAL", "COMMENT", "IDENTIFIERS", "WS"
	};
	public static final String[] ruleNames = {
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "OPERATOR", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", "COMMENT", 
		"IDENTIFIERS", "WS"
	};


	public MicroLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Micro.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 24: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\33\u00e7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00af"+
		"\n\24\3\25\6\25\u00b2\n\25\r\25\16\25\u00b3\3\26\6\26\u00b7\n\26\r\26"+
		"\16\26\u00b8\3\26\3\26\6\26\u00bd\n\26\r\26\16\26\u00be\3\26\3\26\6\26"+
		"\u00c3\n\26\r\26\16\26\u00c4\5\26\u00c7\n\26\3\27\3\27\7\27\u00cb\n\27"+
		"\f\27\16\27\u00ce\13\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00d6\n\30"+
		"\f\30\16\30\u00d9\13\30\3\31\3\31\6\31\u00dd\n\31\r\31\16\31\u00de\3\32"+
		"\6\32\u00e2\n\32\r\32\16\32\u00e3\3\32\3\32\2\33\3\3\1\5\4\1\7\5\1\t\6"+
		"\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35"+
		"\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1"+
		"\63\33\2\3\2\n\6\2,-//\61\61??\6\2*+..=>@@\3\2\62;\3\2$$\3\2\f\f\3\2C"+
		"|\4\2\62;C|\5\2\13\f\17\17\"\"\u00f4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3"+
		"\2\2\2\5;\3\2\2\2\7C\3\2\2\2\tI\3\2\2\2\13N\3\2\2\2\rR\3\2\2\2\17[\3\2"+
		"\2\2\21d\3\2\2\2\23i\3\2\2\2\25o\3\2\2\2\27t\3\2\2\2\31z\3\2\2\2\33\u0080"+
		"\3\2\2\2\35\u0087\3\2\2\2\37\u008a\3\2\2\2!\u0091\3\2\2\2#\u0097\3\2\2"+
		"\2%\u009b\3\2\2\2\'\u00ae\3\2\2\2)\u00b1\3\2\2\2+\u00c6\3\2\2\2-\u00c8"+
		"\3\2\2\2/\u00d1\3\2\2\2\61\u00da\3\2\2\2\63\u00e1\3\2\2\2\65\66\7Y\2\2"+
		"\66\67\7T\2\2\678\7K\2\289\7V\2\29:\7G\2\2:\4\3\2\2\2;<\7R\2\2<=\7T\2"+
		"\2=>\7Q\2\2>?\7I\2\2?@\7T\2\2@A\7C\2\2AB\7O\2\2B\6\3\2\2\2CD\7Y\2\2DE"+
		"\7J\2\2EF\7K\2\2FG\7N\2\2GH\7G\2\2H\b\3\2\2\2IJ\7T\2\2JK\7G\2\2KL\7C\2"+
		"\2LM\7F\2\2M\n\3\2\2\2NO\7G\2\2OP\7P\2\2PQ\7F\2\2Q\f\3\2\2\2RS\7H\2\2"+
		"ST\7W\2\2TU\7P\2\2UV\7E\2\2VW\7V\2\2WX\7K\2\2XY\7Q\2\2YZ\7P\2\2Z\16\3"+
		"\2\2\2[\\\7E\2\2\\]\7Q\2\2]^\7P\2\2^_\7V\2\2_`\7K\2\2`a\7P\2\2ab\7W\2"+
		"\2bc\7G\2\2c\20\3\2\2\2de\7G\2\2ef\7N\2\2fg\7U\2\2gh\7G\2\2h\22\3\2\2"+
		"\2ij\7G\2\2jk\7P\2\2kl\7F\2\2lm\7K\2\2mn\7H\2\2n\24\3\2\2\2op\7X\2\2p"+
		"q\7Q\2\2qr\7K\2\2rs\7F\2\2s\26\3\2\2\2tu\7D\2\2uv\7T\2\2vw\7G\2\2wx\7"+
		"C\2\2xy\7M\2\2y\30\3\2\2\2z{\7H\2\2{|\7N\2\2|}\7Q\2\2}~\7C\2\2~\177\7"+
		"V\2\2\177\32\3\2\2\2\u0080\u0081\7U\2\2\u0081\u0082\7V\2\2\u0082\u0083"+
		"\7T\2\2\u0083\u0084\7K\2\2\u0084\u0085\7P\2\2\u0085\u0086\7I\2\2\u0086"+
		"\34\3\2\2\2\u0087\u0088\7K\2\2\u0088\u0089\7H\2\2\u0089\36\3\2\2\2\u008a"+
		"\u008b\7T\2\2\u008b\u008c\7G\2\2\u008c\u008d\7V\2\2\u008d\u008e\7W\2\2"+
		"\u008e\u008f\7T\2\2\u008f\u0090\7P\2\2\u0090 \3\2\2\2\u0091\u0092\7D\2"+
		"\2\u0092\u0093\7G\2\2\u0093\u0094\7I\2\2\u0094\u0095\7K\2\2\u0095\u0096"+
		"\7P\2\2\u0096\"\3\2\2\2\u0097\u0098\7K\2\2\u0098\u0099\7P\2\2\u0099\u009a"+
		"\7V\2\2\u009a$\3\2\2\2\u009b\u009c\7G\2\2\u009c\u009d\7P\2\2\u009d\u009e"+
		"\7F\2\2\u009e\u009f\7Y\2\2\u009f\u00a0\7J\2\2\u00a0\u00a1\7K\2\2\u00a1"+
		"\u00a2\7N\2\2\u00a2\u00a3\7G\2\2\u00a3&\3\2\2\2\u00a4\u00a5\7<\2\2\u00a5"+
		"\u00af\7?\2\2\u00a6\u00af\t\2\2\2\u00a7\u00a8\7#\2\2\u00a8\u00af\7?\2"+
		"\2\u00a9\u00af\t\3\2\2\u00aa\u00ab\7>\2\2\u00ab\u00af\7?\2\2\u00ac\u00ad"+
		"\7@\2\2\u00ad\u00af\7?\2\2\u00ae\u00a4\3\2\2\2\u00ae\u00a6\3\2\2\2\u00ae"+
		"\u00a7\3\2\2\2\u00ae\u00a9\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00af(\3\2\2\2\u00b0\u00b2\t\4\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4*\3\2\2\2\u00b5"+
		"\u00b7\t\4\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\7\60\2\2\u00bb"+
		"\u00bd\t\4\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c7\3\2\2\2\u00c0\u00c2\7\60\2\2\u00c1"+
		"\u00c3\t\4\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00b6\3\2\2\2\u00c6"+
		"\u00c0\3\2\2\2\u00c7,\3\2\2\2\u00c8\u00cc\7$\2\2\u00c9\u00cb\n\5\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7$\2\2\u00d0"+
		".\3\2\2\2\u00d1\u00d2\7/\2\2\u00d2\u00d3\7/\2\2\u00d3\u00d7\3\2\2\2\u00d4"+
		"\u00d6\n\6\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\60\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dc"+
		"\t\7\2\2\u00db\u00dd\t\b\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\62\3\2\2\2\u00e0\u00e2\t\t\2"+
		"\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\b\32\2\2\u00e6\64\3\2\2\2\16"+
		"\2\u00ae\u00b3\u00b8\u00be\u00c4\u00c6\u00cc\u00d7\u00dc\u00de\u00e3";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}