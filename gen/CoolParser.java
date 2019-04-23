// Generated from C:/Users/amr25/Desktop/Compilers/src\Cool.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INHERITS=1, CLASS=2, IF=3, THEN=4, ELSE=5, FI=6, WHILE=7, LOOP=8, POOL=9, 
		LET=10, IN=11, CASE=12, OF=13, ESAC=14, ISVOID=15, NOT=16, NEW=17, TRUE=18, 
		FALSE=19, INTEGER=20, LITERAL=21, TYPE=22, ID=23, ASSIGN_OPERATOR=24, 
		CASE_ARROW=25, EQUAL=26, SMALLER_THAN=27, BIGGER_THAN=28, LESS_THAN_OR_EQUAL=29, 
		PLUS=30, MINUS=31, DIVIDED=32, MULTIPLY=33, INTEGER_NEGATIVE=34, WHITESPACE=35, 
		NEWLINE=36, OPEN_COMMENT=37, CLOSE_COMMENT=38, COMMENT=39, ONE_LINE_COMMENT=40, 
		OPEN_CURLY=41, CLOSE_CURLY=42, OPENP_RANSIS=43, CLOSE_PRANSIS=44, OPEN_SQUARE=45, 
		CLOSE_SQUARE=46, SEMICOLUN=47, COLUN=48, COMMA=49, DOT=50, AT=51, ERROR=52;
	public static final int
		RULE_program = 0, RULE_programBlocks = 1, RULE_classDefine = 2, RULE_feature = 3, 
		RULE_formal = 4, RULE_expr = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programBlocks", "classDefine", "feature", "formal", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inherits'", "'class'", "'if'", "'then'", "'else'", "'fi'", "'while'", 
			"'loop'", "'pool'", "'let'", "'in'", "'case'", "'of'", "'esac'", "'isvoid'", 
			"'not'", "'new'", "'true'", "'false'", null, null, null, null, "'<-'", 
			"'=>'", "'='", "'<'", "'>'", "'<='", "'+'", "'-'", "'/'", "'*'", "'~'", 
			null, null, "'(*'", "'*)'", null, null, "'{'", "'}'", "'('", "')'", "'['", 
			"']'", "';'", "':'", "','", "'.'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INHERITS", "CLASS", "IF", "THEN", "ELSE", "FI", "WHILE", "LOOP", 
			"POOL", "LET", "IN", "CASE", "OF", "ESAC", "ISVOID", "NOT", "NEW", "TRUE", 
			"FALSE", "INTEGER", "LITERAL", "TYPE", "ID", "ASSIGN_OPERATOR", "CASE_ARROW", 
			"EQUAL", "SMALLER_THAN", "BIGGER_THAN", "LESS_THAN_OR_EQUAL", "PLUS", 
			"MINUS", "DIVIDED", "MULTIPLY", "INTEGER_NEGATIVE", "WHITESPACE", "NEWLINE", 
			"OPEN_COMMENT", "CLOSE_COMMENT", "COMMENT", "ONE_LINE_COMMENT", "OPEN_CURLY", 
			"CLOSE_CURLY", "OPENP_RANSIS", "CLOSE_PRANSIS", "OPEN_SQUARE", "CLOSE_SQUARE", 
			"SEMICOLUN", "COLUN", "COMMA", "DOT", "AT", "ERROR"
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

	@Override
	public String getGrammarFileName() { return "Cool.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramBlocksContext programBlocks() {
			return getRuleContext(ProgramBlocksContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			programBlocks();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramBlocksContext extends ParserRuleContext {
		public ClassDefineContext classDefine() {
			return getRuleContext(ClassDefineContext.class,0);
		}
		public TerminalNode SEMICOLUN() { return getToken(CoolParser.SEMICOLUN, 0); }
		public ProgramBlocksContext programBlocks() {
			return getRuleContext(ProgramBlocksContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CoolParser.EOF, 0); }
		public ProgramBlocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programBlocks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterProgramBlocks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitProgramBlocks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitProgramBlocks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramBlocksContext programBlocks() throws RecognitionException {
		ProgramBlocksContext _localctx = new ProgramBlocksContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programBlocks);
		try {
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				classDefine();
				setState(15);
				match(SEMICOLUN);
				setState(16);
				programBlocks();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDefineContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(CoolParser.CLASS, 0); }
		public List<TerminalNode> TYPE() { return getTokens(CoolParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CoolParser.TYPE, i);
		}
		public TerminalNode OPEN_CURLY() { return getToken(CoolParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(CoolParser.CLOSE_CURLY, 0); }
		public TerminalNode INHERITS() { return getToken(CoolParser.INHERITS, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public List<TerminalNode> SEMICOLUN() { return getTokens(CoolParser.SEMICOLUN); }
		public TerminalNode SEMICOLUN(int i) {
			return getToken(CoolParser.SEMICOLUN, i);
		}
		public ClassDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterClassDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitClassDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitClassDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefineContext classDefine() throws RecognitionException {
		ClassDefineContext _localctx = new ClassDefineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(CLASS);
			setState(22);
			match(TYPE);
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(23);
				match(INHERITS);
				setState(24);
				match(TYPE);
				}
			}

			setState(27);
			match(OPEN_CURLY);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(28);
				feature();
				setState(29);
				match(SEMICOLUN);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeatureContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode OPENP_RANSIS() { return getToken(CoolParser.OPENP_RANSIS, 0); }
		public TerminalNode CLOSE_PRANSIS() { return getToken(CoolParser.CLOSE_PRANSIS, 0); }
		public TerminalNode COLUN() { return getToken(CoolParser.COLUN, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(CoolParser.OPEN_CURLY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(CoolParser.CLOSE_CURLY, 0); }
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public TerminalNode ASSIGN_OPERATOR() { return getToken(CoolParser.ASSIGN_OPERATOR, 0); }
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitFeature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitFeature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_feature);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(ID);
				setState(39);
				match(OPENP_RANSIS);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(40);
					formal();
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(41);
						match(COMMA);
						setState(42);
						formal();
						}
						}
						setState(47);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(53);
				match(CLOSE_PRANSIS);
				setState(54);
				match(COLUN);
				setState(55);
				match(TYPE);
				setState(56);
				match(OPEN_CURLY);
				setState(57);
				expr(0);
				setState(58);
				match(CLOSE_CURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(ID);
				setState(61);
				match(COLUN);
				setState(62);
				match(TYPE);
				{
				setState(63);
				match(ASSIGN_OPERATOR);
				setState(64);
				expr(0);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode COLUN() { return getToken(CoolParser.COLUN, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitFormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ID);
			setState(68);
			match(COLUN);
			setState(69);
			match(TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public List<TerminalNode> ASSIGN_OPERATOR() { return getTokens(CoolParser.ASSIGN_OPERATOR); }
		public TerminalNode ASSIGN_OPERATOR(int i) {
			return getToken(CoolParser.ASSIGN_OPERATOR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPENP_RANSIS() { return getToken(CoolParser.OPENP_RANSIS, 0); }
		public TerminalNode CLOSE_PRANSIS() { return getToken(CoolParser.CLOSE_PRANSIS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public TerminalNode IF() { return getToken(CoolParser.IF, 0); }
		public TerminalNode THEN() { return getToken(CoolParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(CoolParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(CoolParser.FI, 0); }
		public TerminalNode WHILE() { return getToken(CoolParser.WHILE, 0); }
		public TerminalNode LOOP() { return getToken(CoolParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(CoolParser.POOL, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(CoolParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(CoolParser.CLOSE_CURLY, 0); }
		public List<TerminalNode> SEMICOLUN() { return getTokens(CoolParser.SEMICOLUN); }
		public TerminalNode SEMICOLUN(int i) {
			return getToken(CoolParser.SEMICOLUN, i);
		}
		public TerminalNode LET() { return getToken(CoolParser.LET, 0); }
		public List<TerminalNode> COLUN() { return getTokens(CoolParser.COLUN); }
		public TerminalNode COLUN(int i) {
			return getToken(CoolParser.COLUN, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(CoolParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CoolParser.TYPE, i);
		}
		public TerminalNode IN() { return getToken(CoolParser.IN, 0); }
		public TerminalNode CASE() { return getToken(CoolParser.CASE, 0); }
		public TerminalNode OF() { return getToken(CoolParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(CoolParser.ESAC, 0); }
		public List<TerminalNode> CASE_ARROW() { return getTokens(CoolParser.CASE_ARROW); }
		public TerminalNode CASE_ARROW(int i) {
			return getToken(CoolParser.CASE_ARROW, i);
		}
		public TerminalNode NEW() { return getToken(CoolParser.NEW, 0); }
		public TerminalNode ISVOID() { return getToken(CoolParser.ISVOID, 0); }
		public TerminalNode INTEGER_NEGATIVE() { return getToken(CoolParser.INTEGER_NEGATIVE, 0); }
		public TerminalNode NOT() { return getToken(CoolParser.NOT, 0); }
		public TerminalNode INTEGER() { return getToken(CoolParser.INTEGER, 0); }
		public TerminalNode LITERAL() { return getToken(CoolParser.LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(CoolParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CoolParser.FALSE, 0); }
		public TerminalNode PLUS() { return getToken(CoolParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CoolParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(CoolParser.MULTIPLY, 0); }
		public TerminalNode DIVIDED() { return getToken(CoolParser.DIVIDED, 0); }
		public TerminalNode SMALLER_THAN() { return getToken(CoolParser.SMALLER_THAN, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(CoolParser.LESS_THAN_OR_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(CoolParser.EQUAL, 0); }
		public TerminalNode DOT() { return getToken(CoolParser.DOT, 0); }
		public TerminalNode AT() { return getToken(CoolParser.AT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(72);
				match(ID);
				setState(73);
				match(ASSIGN_OPERATOR);
				setState(74);
				expr(25);
				}
				break;
			case 2:
				{
				setState(75);
				match(ID);
				setState(76);
				match(OPENP_RANSIS);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LET) | (1L << CASE) | (1L << ISVOID) | (1L << NOT) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << LITERAL) | (1L << ID) | (1L << INTEGER_NEGATIVE) | (1L << OPEN_CURLY) | (1L << OPENP_RANSIS))) != 0)) {
					{
					{
					setState(77);
					expr(0);
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(78);
						match(COMMA);
						setState(79);
						expr(0);
						}
						}
						setState(84);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				match(CLOSE_PRANSIS);
				}
				break;
			case 3:
				{
				setState(91);
				match(IF);
				setState(92);
				expr(0);
				setState(93);
				match(THEN);
				setState(94);
				expr(0);
				setState(95);
				match(ELSE);
				setState(96);
				expr(0);
				setState(97);
				match(FI);
				}
				break;
			case 4:
				{
				setState(99);
				match(WHILE);
				setState(100);
				expr(0);
				setState(101);
				match(LOOP);
				setState(102);
				expr(0);
				setState(103);
				match(POOL);
				}
				break;
			case 5:
				{
				setState(105);
				match(OPEN_CURLY);
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(106);
					expr(0);
					setState(107);
					match(SEMICOLUN);
					}
					}
					setState(111); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LET) | (1L << CASE) | (1L << ISVOID) | (1L << NOT) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << LITERAL) | (1L << ID) | (1L << INTEGER_NEGATIVE) | (1L << OPEN_CURLY) | (1L << OPENP_RANSIS))) != 0) );
				setState(113);
				match(CLOSE_CURLY);
				}
				break;
			case 6:
				{
				setState(115);
				match(LET);
				setState(116);
				match(ID);
				setState(117);
				match(COLUN);
				setState(118);
				match(TYPE);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN_OPERATOR) {
					{
					setState(119);
					match(ASSIGN_OPERATOR);
					setState(120);
					expr(0);
					}
				}

				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(123);
					match(COMMA);
					setState(124);
					match(ID);
					setState(125);
					match(COLUN);
					setState(126);
					match(TYPE);
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN_OPERATOR) {
						{
						setState(127);
						match(ASSIGN_OPERATOR);
						setState(128);
						expr(0);
						}
					}

					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				match(IN);
				setState(137);
				expr(19);
				}
				break;
			case 7:
				{
				setState(138);
				match(CASE);
				setState(139);
				expr(0);
				setState(140);
				match(OF);
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(141);
					match(ID);
					setState(142);
					match(COLUN);
					setState(143);
					match(TYPE);
					setState(144);
					match(CASE_ARROW);
					setState(145);
					expr(0);
					setState(146);
					match(SEMICOLUN);
					}
					}
					setState(150); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(152);
				match(ESAC);
				}
				break;
			case 8:
				{
				setState(154);
				match(NEW);
				setState(155);
				match(TYPE);
				}
				break;
			case 9:
				{
				setState(156);
				match(ISVOID);
				setState(157);
				expr(16);
				}
				break;
			case 10:
				{
				setState(158);
				match(INTEGER_NEGATIVE);
				setState(159);
				expr(11);
				}
				break;
			case 11:
				{
				setState(160);
				match(NOT);
				setState(161);
				expr(7);
				}
				break;
			case 12:
				{
				setState(162);
				match(OPENP_RANSIS);
				setState(163);
				expr(0);
				setState(164);
				match(CLOSE_PRANSIS);
				}
				break;
			case 13:
				{
				setState(166);
				match(ID);
				}
				break;
			case 14:
				{
				setState(167);
				match(INTEGER);
				}
				break;
			case 15:
				{
				setState(168);
				match(LITERAL);
				}
				break;
			case 16:
				{
				setState(169);
				match(TRUE);
				}
				break;
			case 17:
				{
				setState(170);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(174);
						match(PLUS);
						setState(175);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(177);
						match(MINUS);
						setState(178);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(180);
						match(MULTIPLY);
						setState(181);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(183);
						match(DIVIDED);
						setState(184);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(186);
						match(SMALLER_THAN);
						setState(187);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(189);
						match(LESS_THAN_OR_EQUAL);
						setState(190);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(192);
						match(EQUAL);
						setState(193);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(197);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AT) {
							{
							setState(195);
							match(AT);
							setState(196);
							match(TYPE);
							}
						}

						setState(199);
						match(DOT);
						setState(200);
						match(ID);
						setState(201);
						match(OPENP_RANSIS);
						setState(212);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LET) | (1L << CASE) | (1L << ISVOID) | (1L << NOT) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << LITERAL) | (1L << ID) | (1L << INTEGER_NEGATIVE) | (1L << OPEN_CURLY) | (1L << OPENP_RANSIS))) != 0)) {
							{
							{
							setState(202);
							expr(0);
							setState(207);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(203);
								match(COMMA);
								setState(204);
								expr(0);
								}
								}
								setState(209);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							}
							setState(214);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(215);
						match(CLOSE_PRANSIS);
						}
						break;
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 24);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u00e0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\26\n\3\3\4\3\4\3\4\3\4\5\4\34\n\4\3\4\3\4\3\4\3\4\7\4\"\n\4\f\4\16"+
		"\4%\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5.\n\5\f\5\16\5\61\13\5\7\5\63"+
		"\n\5\f\5\16\5\66\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5D\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7S\n\7"+
		"\f\7\16\7V\13\7\7\7X\n\7\f\7\16\7[\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7p\n\7\r\7\16\7q\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7|\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0084"+
		"\n\7\7\7\u0086\n\7\f\7\16\7\u0089\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\6\7\u0097\n\7\r\7\16\7\u0098\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ae\n\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c8\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00d0"+
		"\n\7\f\7\16\7\u00d3\13\7\7\7\u00d5\n\7\f\7\16\7\u00d8\13\7\3\7\7\7\u00db"+
		"\n\7\f\7\16\7\u00de\13\7\3\7\2\3\f\b\2\4\6\b\n\f\2\2\2\u0101\2\16\3\2"+
		"\2\2\4\25\3\2\2\2\6\27\3\2\2\2\bC\3\2\2\2\nE\3\2\2\2\f\u00ad\3\2\2\2\16"+
		"\17\5\4\3\2\17\3\3\2\2\2\20\21\5\6\4\2\21\22\7\61\2\2\22\23\5\4\3\2\23"+
		"\26\3\2\2\2\24\26\7\2\2\3\25\20\3\2\2\2\25\24\3\2\2\2\26\5\3\2\2\2\27"+
		"\30\7\4\2\2\30\33\7\30\2\2\31\32\7\3\2\2\32\34\7\30\2\2\33\31\3\2\2\2"+
		"\33\34\3\2\2\2\34\35\3\2\2\2\35#\7+\2\2\36\37\5\b\5\2\37 \7\61\2\2 \""+
		"\3\2\2\2!\36\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2"+
		"\2&\'\7,\2\2\'\7\3\2\2\2()\7\31\2\2)\64\7-\2\2*/\5\n\6\2+,\7\63\2\2,."+
		"\5\n\6\2-+\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\63\3\2\2\2\61"+
		"/\3\2\2\2\62*\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67"+
		"\3\2\2\2\66\64\3\2\2\2\678\7.\2\289\7\62\2\29:\7\30\2\2:;\7+\2\2;<\5\f"+
		"\7\2<=\7,\2\2=D\3\2\2\2>?\7\31\2\2?@\7\62\2\2@A\7\30\2\2AB\7\32\2\2BD"+
		"\5\f\7\2C(\3\2\2\2C>\3\2\2\2D\t\3\2\2\2EF\7\31\2\2FG\7\62\2\2GH\7\30\2"+
		"\2H\13\3\2\2\2IJ\b\7\1\2JK\7\31\2\2KL\7\32\2\2L\u00ae\5\f\7\33MN\7\31"+
		"\2\2NY\7-\2\2OT\5\f\7\2PQ\7\63\2\2QS\5\f\7\2RP\3\2\2\2SV\3\2\2\2TR\3\2"+
		"\2\2TU\3\2\2\2UX\3\2\2\2VT\3\2\2\2WO\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2"+
		"\2\2Z\\\3\2\2\2[Y\3\2\2\2\\\u00ae\7.\2\2]^\7\5\2\2^_\5\f\7\2_`\7\6\2\2"+
		"`a\5\f\7\2ab\7\7\2\2bc\5\f\7\2cd\7\b\2\2d\u00ae\3\2\2\2ef\7\t\2\2fg\5"+
		"\f\7\2gh\7\n\2\2hi\5\f\7\2ij\7\13\2\2j\u00ae\3\2\2\2ko\7+\2\2lm\5\f\7"+
		"\2mn\7\61\2\2np\3\2\2\2ol\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2"+
		"\2\2st\7,\2\2t\u00ae\3\2\2\2uv\7\f\2\2vw\7\31\2\2wx\7\62\2\2x{\7\30\2"+
		"\2yz\7\32\2\2z|\5\f\7\2{y\3\2\2\2{|\3\2\2\2|\u0087\3\2\2\2}~\7\63\2\2"+
		"~\177\7\31\2\2\177\u0080\7\62\2\2\u0080\u0083\7\30\2\2\u0081\u0082\7\32"+
		"\2\2\u0082\u0084\5\f\7\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085}\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2"+
		"\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b"+
		"\7\r\2\2\u008b\u00ae\5\f\7\25\u008c\u008d\7\16\2\2\u008d\u008e\5\f\7\2"+
		"\u008e\u0096\7\17\2\2\u008f\u0090\7\31\2\2\u0090\u0091\7\62\2\2\u0091"+
		"\u0092\7\30\2\2\u0092\u0093\7\33\2\2\u0093\u0094\5\f\7\2\u0094\u0095\7"+
		"\61\2\2\u0095\u0097\3\2\2\2\u0096\u008f\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\20"+
		"\2\2\u009b\u00ae\3\2\2\2\u009c\u009d\7\23\2\2\u009d\u00ae\7\30\2\2\u009e"+
		"\u009f\7\21\2\2\u009f\u00ae\5\f\7\22\u00a0\u00a1\7$\2\2\u00a1\u00ae\5"+
		"\f\7\r\u00a2\u00a3\7\22\2\2\u00a3\u00ae\5\f\7\t\u00a4\u00a5\7-\2\2\u00a5"+
		"\u00a6\5\f\7\2\u00a6\u00a7\7.\2\2\u00a7\u00ae\3\2\2\2\u00a8\u00ae\7\31"+
		"\2\2\u00a9\u00ae\7\26\2\2\u00aa\u00ae\7\27\2\2\u00ab\u00ae\7\24\2\2\u00ac"+
		"\u00ae\7\25\2\2\u00adI\3\2\2\2\u00adM\3\2\2\2\u00ad]\3\2\2\2\u00ade\3"+
		"\2\2\2\u00adk\3\2\2\2\u00adu\3\2\2\2\u00ad\u008c\3\2\2\2\u00ad\u009c\3"+
		"\2\2\2\u00ad\u009e\3\2\2\2\u00ad\u00a0\3\2\2\2\u00ad\u00a2\3\2\2\2\u00ad"+
		"\u00a4\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00dc\3\2\2\2\u00af"+
		"\u00b0\f\21\2\2\u00b0\u00b1\7 \2\2\u00b1\u00db\5\f\7\22\u00b2\u00b3\f"+
		"\20\2\2\u00b3\u00b4\7!\2\2\u00b4\u00db\5\f\7\21\u00b5\u00b6\f\17\2\2\u00b6"+
		"\u00b7\7#\2\2\u00b7\u00db\5\f\7\20\u00b8\u00b9\f\16\2\2\u00b9\u00ba\7"+
		"\"\2\2\u00ba\u00db\5\f\7\17\u00bb\u00bc\f\f\2\2\u00bc\u00bd\7\35\2\2\u00bd"+
		"\u00db\5\f\7\r\u00be\u00bf\f\13\2\2\u00bf\u00c0\7\37\2\2\u00c0\u00db\5"+
		"\f\7\f\u00c1\u00c2\f\n\2\2\u00c2\u00c3\7\34\2\2\u00c3\u00db\5\f\7\13\u00c4"+
		"\u00c7\f\32\2\2\u00c5\u00c6\7\65\2\2\u00c6\u00c8\7\30\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7\64\2\2"+
		"\u00ca\u00cb\7\31\2\2\u00cb\u00d6\7-\2\2\u00cc\u00d1\5\f\7\2\u00cd\u00ce"+
		"\7\63\2\2\u00ce\u00d0\5\f\7\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2"+
		"\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\7."+
		"\2\2\u00da\u00af\3\2\2\2\u00da\u00b2\3\2\2\2\u00da\u00b5\3\2\2\2\u00da"+
		"\u00b8\3\2\2\2\u00da\u00bb\3\2\2\2\u00da\u00be\3\2\2\2\u00da\u00c1\3\2"+
		"\2\2\u00da\u00c4\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\r\3\2\2\2\u00de\u00dc\3\2\2\2\25\25\33#/\64CTYq{"+
		"\u0083\u0087\u0098\u00ad\u00c7\u00d1\u00d6\u00da\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}