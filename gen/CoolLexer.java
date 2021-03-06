// Generated from C:/Users/ESLAMALSABBAGH/Desktop/Compilers/src\Cool.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, CLASS=4, ELSE=5, FALSE=6, FI=7, IF=8, IN=9, INHERITS=10, 
		ISVOID=11, LET=12, LOOP=13, POOL=14, THEN=15, WHILE=16, CASE=17, ESAC=18, 
		NEW=19, OF=20, NOT=21, TRUE=22, STRING=23, INT=24, TYPEID=25, OBJECTID=26, 
		COMMENT=27, ONE_LINE_COMMENT=28, WHITESPACE=29, ASSIGNMENT=30, CASE_ARROW=31, 
		ADD=32, MINUS=33, MULTIPLY=34, DIVISION=35, LESS_THAN=36, LESS_EQUAL=37, 
		EQUAL=38, INTEGER_NEGATIVE=39, OPENBRAKETS=40, CLOSEBRAKETS=41, OPENSBRACES=42, 
		CLOSEBRACES=43, SEMICOLON=44, COLON=45, OPEN_COMMENT=46, CLOSE_COMMENT=47, 
		ERROR=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "CLASS", "ELSE", "FALSE", "FI", "IF", "IN", "INHERITS", 
			"ISVOID", "LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "NEW", 
			"OF", "NOT", "TRUE", "STRING", "INT", "TYPEID", "OBJECTID", "COMMENT", 
			"ONE_LINE_COMMENT", "WHITESPACE", "ASSIGNMENT", "CASE_ARROW", "ADD", 
			"MINUS", "MULTIPLY", "DIVISION", "LESS_THAN", "LESS_EQUAL", "EQUAL", 
			"INTEGER_NEGATIVE", "OPENBRAKETS", "CLOSEBRAKETS", "OPENSBRACES", "CLOSEBRACES", 
			"SEMICOLON", "COLON", "A", "C", "D", "E", "F", "H", "I", "L", "N", "O", 
			"P", "R", "S", "T", "U", "V", "W", "ESC", "UNICODE", "HEX", "OPEN_COMMENT", 
			"CLOSE_COMMENT", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'@'", "'.'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'<-'", "'=>'", "'+'", "'-'", 
			"'*'", "'/'", "'<'", "'<='", "'='", "'~'", "'('", "')'", "'{'", "'}'", 
			"';'", "':'", "'(*'", "'*)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "CLASS", "ELSE", "FALSE", "FI", "IF", "IN", "INHERITS", 
			"ISVOID", "LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "NEW", 
			"OF", "NOT", "TRUE", "STRING", "INT", "TYPEID", "OBJECTID", "COMMENT", 
			"ONE_LINE_COMMENT", "WHITESPACE", "ASSIGNMENT", "CASE_ARROW", "ADD", 
			"MINUS", "MULTIPLY", "DIVISION", "LESS_THAN", "LESS_EQUAL", "EQUAL", 
			"INTEGER_NEGATIVE", "OPENBRAKETS", "CLOSEBRAKETS", "OPENSBRACES", "CLOSEBRACES", 
			"SEMICOLON", "COLON", "OPEN_COMMENT", "CLOSE_COMMENT", "ERROR"
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


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cool.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0186\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\7\30\u00f2\n\30\f\30\16\30\u00f5\13\30\3"+
		"\30\3\30\3\31\6\31\u00fa\n\31\r\31\16\31\u00fb\3\32\3\32\7\32\u0100\n"+
		"\32\f\32\16\32\u0103\13\32\3\33\3\33\7\33\u0107\n\33\f\33\16\33\u010a"+
		"\13\33\3\34\3\34\3\34\7\34\u010f\n\34\f\34\16\34\u0112\13\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u011c\n\35\f\35\16\35\u011f\13\35"+
		"\3\35\5\35\u0122\n\35\3\35\3\35\3\36\6\36\u0127\n\36\r\36\16\36\u0128"+
		"\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&"+
		"\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3"+
		"\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3"+
		"\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\5@\u0175"+
		"\n@\3A\3A\3A\3A\3A\3A\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3\u0110\2F\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y"+
		"\2{\2}\2\177\2\u0081\2\u0083\2\u0085\60\u0087\61\u0089\62\3\2\34\4\2$"+
		"$^^\3\2\62;\3\2C\\\6\2\62;C\\aac|\3\2c|\3\2\f\f\5\2\13\f\16\17\"\"\4\2"+
		"CCcc\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2JJjj\4\2KKkk\4\2NNnn\4\2PPpp\4"+
		"\2QQqq\4\2RRrr\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\n\2$$\61"+
		"\61^^ddhhppttvv\5\2\62;CHch\2\u017c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\3\u008b\3\2\2"+
		"\2\5\u008d\3\2\2\2\7\u008f\3\2\2\2\t\u0091\3\2\2\2\13\u0097\3\2\2\2\r"+
		"\u009c\3\2\2\2\17\u00a2\3\2\2\2\21\u00a5\3\2\2\2\23\u00a8\3\2\2\2\25\u00ab"+
		"\3\2\2\2\27\u00b4\3\2\2\2\31\u00bb\3\2\2\2\33\u00bf\3\2\2\2\35\u00c4\3"+
		"\2\2\2\37\u00c9\3\2\2\2!\u00ce\3\2\2\2#\u00d4\3\2\2\2%\u00d9\3\2\2\2\'"+
		"\u00de\3\2\2\2)\u00e2\3\2\2\2+\u00e5\3\2\2\2-\u00e9\3\2\2\2/\u00ee\3\2"+
		"\2\2\61\u00f9\3\2\2\2\63\u00fd\3\2\2\2\65\u0104\3\2\2\2\67\u010b\3\2\2"+
		"\29\u0117\3\2\2\2;\u0126\3\2\2\2=\u012c\3\2\2\2?\u012f\3\2\2\2A\u0132"+
		"\3\2\2\2C\u0134\3\2\2\2E\u0136\3\2\2\2G\u0138\3\2\2\2I\u013a\3\2\2\2K"+
		"\u013c\3\2\2\2M\u013f\3\2\2\2O\u0141\3\2\2\2Q\u0143\3\2\2\2S\u0145\3\2"+
		"\2\2U\u0147\3\2\2\2W\u0149\3\2\2\2Y\u014b\3\2\2\2[\u014d\3\2\2\2]\u014f"+
		"\3\2\2\2_\u0151\3\2\2\2a\u0153\3\2\2\2c\u0155\3\2\2\2e\u0157\3\2\2\2g"+
		"\u0159\3\2\2\2i\u015b\3\2\2\2k\u015d\3\2\2\2m\u015f\3\2\2\2o\u0161\3\2"+
		"\2\2q\u0163\3\2\2\2s\u0165\3\2\2\2u\u0167\3\2\2\2w\u0169\3\2\2\2y\u016b"+
		"\3\2\2\2{\u016d\3\2\2\2}\u016f\3\2\2\2\177\u0171\3\2\2\2\u0081\u0176\3"+
		"\2\2\2\u0083\u017c\3\2\2\2\u0085\u017e\3\2\2\2\u0087\u0181\3\2\2\2\u0089"+
		"\u0184\3\2\2\2\u008b\u008c\7.\2\2\u008c\4\3\2\2\2\u008d\u008e\7B\2\2\u008e"+
		"\6\3\2\2\2\u008f\u0090\7\60\2\2\u0090\b\3\2\2\2\u0091\u0092\5_\60\2\u0092"+
		"\u0093\5k\66\2\u0093\u0094\5]/\2\u0094\u0095\5u;\2\u0095\u0096\5u;\2\u0096"+
		"\n\3\2\2\2\u0097\u0098\5c\62\2\u0098\u0099\5k\66\2\u0099\u009a\5u;\2\u009a"+
		"\u009b\5c\62\2\u009b\f\3\2\2\2\u009c\u009d\7h\2\2\u009d\u009e\5]/\2\u009e"+
		"\u009f\5k\66\2\u009f\u00a0\5u;\2\u00a0\u00a1\5c\62\2\u00a1\16\3\2\2\2"+
		"\u00a2\u00a3\5e\63\2\u00a3\u00a4\5i\65\2\u00a4\20\3\2\2\2\u00a5\u00a6"+
		"\5i\65\2\u00a6\u00a7\5e\63\2\u00a7\22\3\2\2\2\u00a8\u00a9\5i\65\2\u00a9"+
		"\u00aa\5m\67\2\u00aa\24\3\2\2\2\u00ab\u00ac\5i\65\2\u00ac\u00ad\5m\67"+
		"\2\u00ad\u00ae\5g\64\2\u00ae\u00af\5c\62\2\u00af\u00b0\5s:\2\u00b0\u00b1"+
		"\5i\65\2\u00b1\u00b2\5w<\2\u00b2\u00b3\5u;\2\u00b3\26\3\2\2\2\u00b4\u00b5"+
		"\5i\65\2\u00b5\u00b6\5u;\2\u00b6\u00b7\5{>\2\u00b7\u00b8\5o8\2\u00b8\u00b9"+
		"\5i\65\2\u00b9\u00ba\5a\61\2\u00ba\30\3\2\2\2\u00bb\u00bc\5k\66\2\u00bc"+
		"\u00bd\5c\62\2\u00bd\u00be\5w<\2\u00be\32\3\2\2\2\u00bf\u00c0\5k\66\2"+
		"\u00c0\u00c1\5o8\2\u00c1\u00c2\5o8\2\u00c2\u00c3\5q9\2\u00c3\34\3\2\2"+
		"\2\u00c4\u00c5\5q9\2\u00c5\u00c6\5o8\2\u00c6\u00c7\5o8\2\u00c7\u00c8\5"+
		"k\66\2\u00c8\36\3\2\2\2\u00c9\u00ca\5w<\2\u00ca\u00cb\5g\64\2\u00cb\u00cc"+
		"\5c\62\2\u00cc\u00cd\5m\67\2\u00cd \3\2\2\2\u00ce\u00cf\5}?\2\u00cf\u00d0"+
		"\5g\64\2\u00d0\u00d1\5i\65\2\u00d1\u00d2\5k\66\2\u00d2\u00d3\5c\62\2\u00d3"+
		"\"\3\2\2\2\u00d4\u00d5\5_\60\2\u00d5\u00d6\5]/\2\u00d6\u00d7\5u;\2\u00d7"+
		"\u00d8\5c\62\2\u00d8$\3\2\2\2\u00d9\u00da\5c\62\2\u00da\u00db\5u;\2\u00db"+
		"\u00dc\5]/\2\u00dc\u00dd\5_\60\2\u00dd&\3\2\2\2\u00de\u00df\5m\67\2\u00df"+
		"\u00e0\5c\62\2\u00e0\u00e1\5}?\2\u00e1(\3\2\2\2\u00e2\u00e3\5o8\2\u00e3"+
		"\u00e4\5e\63\2\u00e4*\3\2\2\2\u00e5\u00e6\5m\67\2\u00e6\u00e7\5o8\2\u00e7"+
		"\u00e8\5w<\2\u00e8,\3\2\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\5s:\2\u00eb"+
		"\u00ec\5y=\2\u00ec\u00ed\5c\62\2\u00ed.\3\2\2\2\u00ee\u00f3\7$\2\2\u00ef"+
		"\u00f2\5\177@\2\u00f0\u00f2\n\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3"+
		"\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7$\2\2\u00f7\60\3\2\2\2"+
		"\u00f8\u00fa\t\3\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\62\3\2\2\2\u00fd\u0101\t\4\2\2\u00fe"+
		"\u0100\t\5\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\64\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0108"+
		"\t\6\2\2\u0105\u0107\t\5\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\66\3\2\2\2\u010a\u0108\3\2\2"+
		"\2\u010b\u0110\5\u0085C\2\u010c\u010f\5\67\34\2\u010d\u010f\13\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113"+
		"\u0114\5\u0087D\2\u0114\u0115\3\2\2\2\u0115\u0116\b\34\2\2\u01168\3\2"+
		"\2\2\u0117\u0118\7/\2\2\u0118\u0119\7/\2\2\u0119\u011d\3\2\2\2\u011a\u011c"+
		"\n\7\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122\7\f"+
		"\2\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0124\b\35\2\2\u0124:\3\2\2\2\u0125\u0127\t\b\2\2\u0126\u0125\3\2\2\2"+
		"\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a"+
		"\3\2\2\2\u012a\u012b\b\36\2\2\u012b<\3\2\2\2\u012c\u012d\7>\2\2\u012d"+
		"\u012e\7/\2\2\u012e>\3\2\2\2\u012f\u0130\7?\2\2\u0130\u0131\7@\2\2\u0131"+
		"@\3\2\2\2\u0132\u0133\7-\2\2\u0133B\3\2\2\2\u0134\u0135\7/\2\2\u0135D"+
		"\3\2\2\2\u0136\u0137\7,\2\2\u0137F\3\2\2\2\u0138\u0139\7\61\2\2\u0139"+
		"H\3\2\2\2\u013a\u013b\7>\2\2\u013bJ\3\2\2\2\u013c\u013d\7>\2\2\u013d\u013e"+
		"\7?\2\2\u013eL\3\2\2\2\u013f\u0140\7?\2\2\u0140N\3\2\2\2\u0141\u0142\7"+
		"\u0080\2\2\u0142P\3\2\2\2\u0143\u0144\7*\2\2\u0144R\3\2\2\2\u0145\u0146"+
		"\7+\2\2\u0146T\3\2\2\2\u0147\u0148\7}\2\2\u0148V\3\2\2\2\u0149\u014a\7"+
		"\177\2\2\u014aX\3\2\2\2\u014b\u014c\7=\2\2\u014cZ\3\2\2\2\u014d\u014e"+
		"\7<\2\2\u014e\\\3\2\2\2\u014f\u0150\t\t\2\2\u0150^\3\2\2\2\u0151\u0152"+
		"\t\n\2\2\u0152`\3\2\2\2\u0153\u0154\t\13\2\2\u0154b\3\2\2\2\u0155\u0156"+
		"\t\f\2\2\u0156d\3\2\2\2\u0157\u0158\t\r\2\2\u0158f\3\2\2\2\u0159\u015a"+
		"\t\16\2\2\u015ah\3\2\2\2\u015b\u015c\t\17\2\2\u015cj\3\2\2\2\u015d\u015e"+
		"\t\20\2\2\u015el\3\2\2\2\u015f\u0160\t\21\2\2\u0160n\3\2\2\2\u0161\u0162"+
		"\t\22\2\2\u0162p\3\2\2\2\u0163\u0164\t\23\2\2\u0164r\3\2\2\2\u0165\u0166"+
		"\t\24\2\2\u0166t\3\2\2\2\u0167\u0168\t\25\2\2\u0168v\3\2\2\2\u0169\u016a"+
		"\t\26\2\2\u016ax\3\2\2\2\u016b\u016c\t\27\2\2\u016cz\3\2\2\2\u016d\u016e"+
		"\t\30\2\2\u016e|\3\2\2\2\u016f\u0170\t\31\2\2\u0170~\3\2\2\2\u0171\u0174"+
		"\7^\2\2\u0172\u0175\t\32\2\2\u0173\u0175\5\u0081A\2\u0174\u0172\3\2\2"+
		"\2\u0174\u0173\3\2\2\2\u0175\u0080\3\2\2\2\u0176\u0177\7w\2\2\u0177\u0178"+
		"\5\u0083B\2\u0178\u0179\5\u0083B\2\u0179\u017a\5\u0083B\2\u017a\u017b"+
		"\5\u0083B\2\u017b\u0082\3\2\2\2\u017c\u017d\t\33\2\2\u017d\u0084\3\2\2"+
		"\2\u017e\u017f\7*\2\2\u017f\u0180\7,\2\2\u0180\u0086\3\2\2\2\u0181\u0182"+
		"\7,\2\2\u0182\u0183\7+\2\2\u0183\u0088\3\2\2\2\u0184\u0185\13\2\2\2\u0185"+
		"\u008a\3\2\2\2\16\2\u00f1\u00f3\u00fb\u0101\u0108\u010e\u0110\u011d\u0121"+
		"\u0128\u0174\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}