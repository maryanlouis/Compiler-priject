// Generated from E:/����� ������/2nd term/compilers/project/Compilers/src\LexerGramCool.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerGramCool extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, ELSE=2, FALSE=3, FI=4, IF=5, IN=6, INHERITS=7, ISVOID=8, LET=9, 
		LOOP=10, POOL=11, THEN=12, WHILE=13, CASE=14, ESAC=15, NEW=16, OF=17, 
		NOT=18, TRUE=19, STRING=20, INT=21, TYPEID=22, OBJECTID=23, COMMENT=24, 
		ONE_LINE_COMMENT=25, WHITESPACE=26, ASSIGNMENT=27, CASE_ARROW=28, ADD=29, 
		MINUS=30, MULTIPLY=31, DIVISION=32, LESS_THAN=33, LESS_EQUAL=34, EQUAL=35, 
		INTEGER_NEGATIVE=36, OPENBRAKETS=37, CLOSEBRAKETS=38, OPENSBRACES=39, 
		CLOSEBRACES=40, SEMICOLON=41, COLON=42, OPEN_COMMENT=43, CLOSE_COMMENT=44, 
		ERROR=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLASS", "ELSE", "FALSE", "FI", "IF", "IN", "INHERITS", "ISVOID", "LET", 
			"LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "NEW", "OF", "NOT", 
			"TRUE", "STRING", "INT", "TYPEID", "OBJECTID", "COMMENT", "ONE_LINE_COMMENT", 
			"WHITESPACE", "ASSIGNMENT", "CASE_ARROW", "ADD", "MINUS", "MULTIPLY", 
			"DIVISION", "LESS_THAN", "LESS_EQUAL", "EQUAL", "INTEGER_NEGATIVE", "OPENBRAKETS", 
			"CLOSEBRAKETS", "OPENSBRACES", "CLOSEBRACES", "SEMICOLON", "COLON", "A", 
			"C", "D", "E", "F", "H", "I", "L", "N", "O", "P", "R", "S", "T", "U", 
			"V", "W", "ESC", "UNICODE", "HEX", "OPEN_COMMENT", "CLOSE_COMMENT", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'<-'", "'=>'", "'+'", "'-'", "'*'", "'/'", "'<'", 
			"'<='", "'='", "'~'", "'('", "')'", "'{'", "'}'", "';'", "':'", "'(*'", 
			"'*)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "ELSE", "FALSE", "FI", "IF", "IN", "INHERITS", "ISVOID", 
			"LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "NEW", "OF", 
			"NOT", "TRUE", "STRING", "INT", "TYPEID", "OBJECTID", "COMMENT", "ONE_LINE_COMMENT", 
			"WHITESPACE", "ASSIGNMENT", "CASE_ARROW", "ADD", "MINUS", "MULTIPLY", 
			"DIVISION", "LESS_THAN", "LESS_EQUAL", "EQUAL", "INTEGER_NEGATIVE", "OPENBRAKETS", 
			"CLOSEBRAKETS", "OPENSBRACES", "CLOSEBRACES", "SEMICOLON", "COLON", "OPEN_COMMENT", 
			"CLOSE_COMMENT", "ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LexerGramCool(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerGramCool.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u017a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u00e6\n\25\f\25\16\25\u00e9\13"+
		"\25\3\25\3\25\3\26\6\26\u00ee\n\26\r\26\16\26\u00ef\3\27\3\27\7\27\u00f4"+
		"\n\27\f\27\16\27\u00f7\13\27\3\30\3\30\7\30\u00fb\n\30\f\30\16\30\u00fe"+
		"\13\30\3\31\3\31\3\31\7\31\u0103\n\31\f\31\16\31\u0106\13\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u0110\n\32\f\32\16\32\u0113\13\32"+
		"\3\32\5\32\u0116\n\32\3\32\3\32\3\33\6\33\u011b\n\33\r\33\16\33\u011c"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3"+
		"=\3=\5=\u0169\n=\3>\3>\3>\3>\3>\3>\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3\u0104"+
		"\2C\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o"+
		"\2q\2s\2u\2w\2y\2{\2}\2\177-\u0081.\u0083/\3\2\34\4\2$$^^\3\2\62;\3\2"+
		"C\\\6\2\62;C\\aac|\3\2c|\3\2\f\f\5\2\13\f\16\17\"\"\4\2CCcc\4\2EEee\4"+
		"\2FFff\4\2GGgg\4\2HHhh\4\2JJjj\4\2KKkk\4\2NNnn\4\2PPpp\4\2QQqq\4\2RRr"+
		"r\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\n\2$$\61\61^^ddhhpp"+
		"ttvv\5\2\62;CHch\2\u0170\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\3\u0085\3\2\2\2\5\u008b\3\2\2\2\7\u0090\3\2\2\2\t\u0096\3\2\2"+
		"\2\13\u0099\3\2\2\2\r\u009c\3\2\2\2\17\u009f\3\2\2\2\21\u00a8\3\2\2\2"+
		"\23\u00af\3\2\2\2\25\u00b3\3\2\2\2\27\u00b8\3\2\2\2\31\u00bd\3\2\2\2\33"+
		"\u00c2\3\2\2\2\35\u00c8\3\2\2\2\37\u00cd\3\2\2\2!\u00d2\3\2\2\2#\u00d6"+
		"\3\2\2\2%\u00d9\3\2\2\2\'\u00dd\3\2\2\2)\u00e2\3\2\2\2+\u00ed\3\2\2\2"+
		"-\u00f1\3\2\2\2/\u00f8\3\2\2\2\61\u00ff\3\2\2\2\63\u010b\3\2\2\2\65\u011a"+
		"\3\2\2\2\67\u0120\3\2\2\29\u0123\3\2\2\2;\u0126\3\2\2\2=\u0128\3\2\2\2"+
		"?\u012a\3\2\2\2A\u012c\3\2\2\2C\u012e\3\2\2\2E\u0130\3\2\2\2G\u0133\3"+
		"\2\2\2I\u0135\3\2\2\2K\u0137\3\2\2\2M\u0139\3\2\2\2O\u013b\3\2\2\2Q\u013d"+
		"\3\2\2\2S\u013f\3\2\2\2U\u0141\3\2\2\2W\u0143\3\2\2\2Y\u0145\3\2\2\2["+
		"\u0147\3\2\2\2]\u0149\3\2\2\2_\u014b\3\2\2\2a\u014d\3\2\2\2c\u014f\3\2"+
		"\2\2e\u0151\3\2\2\2g\u0153\3\2\2\2i\u0155\3\2\2\2k\u0157\3\2\2\2m\u0159"+
		"\3\2\2\2o\u015b\3\2\2\2q\u015d\3\2\2\2s\u015f\3\2\2\2u\u0161\3\2\2\2w"+
		"\u0163\3\2\2\2y\u0165\3\2\2\2{\u016a\3\2\2\2}\u0170\3\2\2\2\177\u0172"+
		"\3\2\2\2\u0081\u0175\3\2\2\2\u0083\u0178\3\2\2\2\u0085\u0086\5Y-\2\u0086"+
		"\u0087\5e\63\2\u0087\u0088\5W,\2\u0088\u0089\5o8\2\u0089\u008a\5o8\2\u008a"+
		"\4\3\2\2\2\u008b\u008c\5]/\2\u008c\u008d\5e\63\2\u008d\u008e\5o8\2\u008e"+
		"\u008f\5]/\2\u008f\6\3\2\2\2\u0090\u0091\7h\2\2\u0091\u0092\5W,\2\u0092"+
		"\u0093\5e\63\2\u0093\u0094\5o8\2\u0094\u0095\5]/\2\u0095\b\3\2\2\2\u0096"+
		"\u0097\5_\60\2\u0097\u0098\5c\62\2\u0098\n\3\2\2\2\u0099\u009a\5c\62\2"+
		"\u009a\u009b\5_\60\2\u009b\f\3\2\2\2\u009c\u009d\5c\62\2\u009d\u009e\5"+
		"g\64\2\u009e\16\3\2\2\2\u009f\u00a0\5c\62\2\u00a0\u00a1\5g\64\2\u00a1"+
		"\u00a2\5a\61\2\u00a2\u00a3\5]/\2\u00a3\u00a4\5m\67\2\u00a4\u00a5\5c\62"+
		"\2\u00a5\u00a6\5q9\2\u00a6\u00a7\5o8\2\u00a7\20\3\2\2\2\u00a8\u00a9\5"+
		"c\62\2\u00a9\u00aa\5o8\2\u00aa\u00ab\5u;\2\u00ab\u00ac\5i\65\2\u00ac\u00ad"+
		"\5c\62\2\u00ad\u00ae\5[.\2\u00ae\22\3\2\2\2\u00af\u00b0\5e\63\2\u00b0"+
		"\u00b1\5]/\2\u00b1\u00b2\5q9\2\u00b2\24\3\2\2\2\u00b3\u00b4\5e\63\2\u00b4"+
		"\u00b5\5i\65\2\u00b5\u00b6\5i\65\2\u00b6\u00b7\5k\66\2\u00b7\26\3\2\2"+
		"\2\u00b8\u00b9\5k\66\2\u00b9\u00ba\5i\65\2\u00ba\u00bb\5i\65\2\u00bb\u00bc"+
		"\5e\63\2\u00bc\30\3\2\2\2\u00bd\u00be\5q9\2\u00be\u00bf\5a\61\2\u00bf"+
		"\u00c0\5]/\2\u00c0\u00c1\5g\64\2\u00c1\32\3\2\2\2\u00c2\u00c3\5w<\2\u00c3"+
		"\u00c4\5a\61\2\u00c4\u00c5\5c\62\2\u00c5\u00c6\5e\63\2\u00c6\u00c7\5]"+
		"/\2\u00c7\34\3\2\2\2\u00c8\u00c9\5Y-\2\u00c9\u00ca\5W,\2\u00ca\u00cb\5"+
		"o8\2\u00cb\u00cc\5]/\2\u00cc\36\3\2\2\2\u00cd\u00ce\5]/\2\u00ce\u00cf"+
		"\5o8\2\u00cf\u00d0\5W,\2\u00d0\u00d1\5Y-\2\u00d1 \3\2\2\2\u00d2\u00d3"+
		"\5g\64\2\u00d3\u00d4\5]/\2\u00d4\u00d5\5w<\2\u00d5\"\3\2\2\2\u00d6\u00d7"+
		"\5i\65\2\u00d7\u00d8\5_\60\2\u00d8$\3\2\2\2\u00d9\u00da\5g\64\2\u00da"+
		"\u00db\5i\65\2\u00db\u00dc\5q9\2\u00dc&\3\2\2\2\u00dd\u00de\7v\2\2\u00de"+
		"\u00df\5m\67\2\u00df\u00e0\5s:\2\u00e0\u00e1\5]/\2\u00e1(\3\2\2\2\u00e2"+
		"\u00e7\7$\2\2\u00e3\u00e6\5y=\2\u00e4\u00e6\n\2\2\2\u00e5\u00e3\3\2\2"+
		"\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7$\2\2\u00eb"+
		"*\3\2\2\2\u00ec\u00ee\t\3\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2"+
		"\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0,\3\2\2\2\u00f1\u00f5\t"+
		"\4\2\2\u00f2\u00f4\t\5\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6.\3\2\2\2\u00f7\u00f5\3\2\2\2"+
		"\u00f8\u00fc\t\6\2\2\u00f9\u00fb\t\5\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\60\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00ff\u0104\5\177@\2\u0100\u0103\5\61\31\2\u0101\u0103"+
		"\13\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2"+
		"\u0104\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0107\u0108\5\u0081A\2\u0108\u0109\3\2\2\2\u0109\u010a\b\31\2"+
		"\2\u010a\62\3\2\2\2\u010b\u010c\7/\2\2\u010c\u010d\7/\2\2\u010d\u0111"+
		"\3\2\2\2\u010e\u0110\n\7\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\u0116\7\f\2\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\b\32\2\2\u0118\64\3\2\2\2\u0119\u011b\t\b\2"+
		"\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\b\33\2\2\u011f\66\3\2\2\2\u0120"+
		"\u0121\7>\2\2\u0121\u0122\7/\2\2\u01228\3\2\2\2\u0123\u0124\7?\2\2\u0124"+
		"\u0125\7@\2\2\u0125:\3\2\2\2\u0126\u0127\7-\2\2\u0127<\3\2\2\2\u0128\u0129"+
		"\7/\2\2\u0129>\3\2\2\2\u012a\u012b\7,\2\2\u012b@\3\2\2\2\u012c\u012d\7"+
		"\61\2\2\u012dB\3\2\2\2\u012e\u012f\7>\2\2\u012fD\3\2\2\2\u0130\u0131\7"+
		">\2\2\u0131\u0132\7?\2\2\u0132F\3\2\2\2\u0133\u0134\7?\2\2\u0134H\3\2"+
		"\2\2\u0135\u0136\7\u0080\2\2\u0136J\3\2\2\2\u0137\u0138\7*\2\2\u0138L"+
		"\3\2\2\2\u0139\u013a\7+\2\2\u013aN\3\2\2\2\u013b\u013c\7}\2\2\u013cP\3"+
		"\2\2\2\u013d\u013e\7\177\2\2\u013eR\3\2\2\2\u013f\u0140\7=\2\2\u0140T"+
		"\3\2\2\2\u0141\u0142\7<\2\2\u0142V\3\2\2\2\u0143\u0144\t\t\2\2\u0144X"+
		"\3\2\2\2\u0145\u0146\t\n\2\2\u0146Z\3\2\2\2\u0147\u0148\t\13\2\2\u0148"+
		"\\\3\2\2\2\u0149\u014a\t\f\2\2\u014a^\3\2\2\2\u014b\u014c\t\r\2\2\u014c"+
		"`\3\2\2\2\u014d\u014e\t\16\2\2\u014eb\3\2\2\2\u014f\u0150\t\17\2\2\u0150"+
		"d\3\2\2\2\u0151\u0152\t\20\2\2\u0152f\3\2\2\2\u0153\u0154\t\21\2\2\u0154"+
		"h\3\2\2\2\u0155\u0156\t\22\2\2\u0156j\3\2\2\2\u0157\u0158\t\23\2\2\u0158"+
		"l\3\2\2\2\u0159\u015a\t\24\2\2\u015an\3\2\2\2\u015b\u015c\t\25\2\2\u015c"+
		"p\3\2\2\2\u015d\u015e\t\26\2\2\u015er\3\2\2\2\u015f\u0160\t\27\2\2\u0160"+
		"t\3\2\2\2\u0161\u0162\t\30\2\2\u0162v\3\2\2\2\u0163\u0164\t\31\2\2\u0164"+
		"x\3\2\2\2\u0165\u0168\7^\2\2\u0166\u0169\t\32\2\2\u0167\u0169\5{>\2\u0168"+
		"\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169z\3\2\2\2\u016a\u016b\7w\2\2\u016b"+
		"\u016c\5}?\2\u016c\u016d\5}?\2\u016d\u016e\5}?\2\u016e\u016f\5}?\2\u016f"+
		"|\3\2\2\2\u0170\u0171\t\33\2\2\u0171~\3\2\2\2\u0172\u0173\7*\2\2\u0173"+
		"\u0174\7,\2\2\u0174\u0080\3\2\2\2\u0175\u0176\7,\2\2\u0176\u0177\7+\2"+
		"\2\u0177\u0082\3\2\2\2\u0178\u0179\13\2\2\2\u0179\u0084\3\2\2\2\16\2\u00e5"+
		"\u00e7\u00ef\u00f5\u00fc\u0102\u0104\u0111\u0115\u011c\u0168\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}