// Generated from /home/alberto/Scrivania/tinyc/tinyc.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tinycParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, ADD=13, SUB=14, MUL=15, DIV=16, MOD=17, AND=18, 
		OR=19, NOT=20, EQ=21, LT=22, LEQ=23, GT=24, GEQ=25, NEQ=26, ID=27, NUMBER=28, 
		STRING=29, COMMENT=30, LINE_COMMENT=31, WS=32, ErrorChar=33;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_statement = 2, RULE_loop = 3, RULE_decl = 4, 
		RULE_assign = 5, RULE_out = 6, RULE_branch = 7, RULE_expr = 8, RULE_read = 9, 
		RULE_arith = 10, RULE_relation = 11, RULE_input = 12, RULE_arithmetic_operator = 13, 
		RULE_logic_operator = 14, RULE_comparison_operator = 15;
	public static final String[] ruleNames = {
		"start", "program", "statement", "loop", "decl", "assign", "out", "branch", 
		"expr", "read", "arith", "relation", "input", "arithmetic_operator", "logic_operator", 
		"comparison_operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'while'", "'('", "')'", "'{'", "'}'", "'int'", "'='", "'write'", 
		"'if'", "'else'", "'read()'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", 
		"'||'", "'!'", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "ADD", "SUB", "MUL", "DIV", "MOD", "AND", "OR", "NOT", "EQ", "LT", 
		"LEQ", "GT", "GEQ", "NEQ", "ID", "NUMBER", "STRING", "COMMENT", "LINE_COMMENT", 
		"WS", "ErrorChar"
	};
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
	public String getGrammarFileName() { return "tinyc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tinycParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(tinycParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			program();
			setState(33);
			match(EOF);
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

	public static class ProgramContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				statement();
				setState(37);
				program();
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

	public static class StatementContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public OutContext out() {
			return getRuleContext(OutContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				decl();
				setState(42);
				match(T__0);
				}
				break;
			case T__2:
			case T__11:
			case ID:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				assign();
				setState(45);
				match(T__0);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				branch();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				out();
				setState(49);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				loop();
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

	public static class LoopContext extends ParserRuleContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__1);
			setState(55);
			match(T__2);
			setState(56);
			relation(0);
			setState(57);
			match(T__3);
			setState(58);
			match(T__4);
			setState(59);
			program();
			setState(60);
			match(T__5);
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

	public static class DeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tinycParser.ID, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__6);
			setState(63);
			match(ID);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tinycParser.ID, 0); }
		public ArithContext arith() {
			return getRuleContext(ArithContext.class,0);
		}
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(ID);
				setState(66);
				match(T__7);
				setState(67);
				arith(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				relation(0);
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

	public static class OutContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(tinycParser.STRING, 0); }
		public OutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out; }
	}

	public final OutContext out() throws RecognitionException {
		OutContext _localctx = new OutContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_out);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(T__8);
				setState(72);
				match(T__2);
				setState(73);
				expr();
				setState(74);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(T__8);
				setState(77);
				match(T__2);
				setState(78);
				match(STRING);
				setState(79);
				match(T__3);
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

	public static class BranchContext extends ParserRuleContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_branch);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(T__9);
				setState(83);
				match(T__2);
				setState(84);
				relation(0);
				setState(85);
				match(T__3);
				setState(86);
				match(T__4);
				setState(87);
				program();
				setState(88);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(T__9);
				setState(91);
				match(T__2);
				setState(92);
				relation(0);
				setState(93);
				match(T__3);
				setState(94);
				match(T__4);
				setState(95);
				program();
				setState(96);
				match(T__5);
				setState(97);
				match(T__10);
				setState(98);
				match(T__4);
				setState(99);
				program();
				setState(100);
				match(T__5);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(tinycParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(tinycParser.ID, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(NUMBER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(ID);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				input();
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

	public static class ReadContext extends ParserRuleContext {
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__11);
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

	public static class ArithContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ArithContext> arith() {
			return getRuleContexts(ArithContext.class);
		}
		public ArithContext arith(int i) {
			return getRuleContext(ArithContext.class,i);
		}
		public Arithmetic_operatorContext arithmetic_operator() {
			return getRuleContext(Arithmetic_operatorContext.class,0);
		}
		public ArithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith; }
	}

	public final ArithContext arith() throws RecognitionException {
		return arith(0);
	}

	private ArithContext arith(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithContext _localctx = new ArithContext(_ctx, _parentState);
		ArithContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_arith, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case ID:
			case NUMBER:
				{
				setState(112);
				expr();
				}
				break;
			case T__2:
				{
				setState(113);
				match(T__2);
				setState(114);
				arith(0);
				setState(115);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arith);
					setState(119);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(120);
					arithmetic_operator();
					setState(121);
					arith(3);
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class RelationContext extends ParserRuleContext {
		public ArithContext arith() {
			return getRuleContext(ArithContext.class,0);
		}
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public Logic_operatorContext logic_operator() {
			return getRuleContext(Logic_operatorContext.class,0);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	}

	public final RelationContext relation() throws RecognitionException {
		return relation(0);
	}

	private RelationContext relation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationContext _localctx = new RelationContext(_ctx, _parentState);
		RelationContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_relation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(129);
				arith(0);
				}
				break;
			case 2:
				{
				setState(130);
				match(T__2);
				setState(131);
				relation(0);
				setState(132);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(144);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new RelationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation);
						setState(136);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(137);
						logic_operator();
						setState(138);
						relation(4);
						}
						break;
					case 2:
						{
						_localctx = new RelationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation);
						setState(140);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(141);
						comparison_operator();
						setState(142);
						relation(3);
						}
						break;
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class InputContext extends ParserRuleContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			read();
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

	public static class Arithmetic_operatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(tinycParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(tinycParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(tinycParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(tinycParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(tinycParser.MOD, 0); }
		public Arithmetic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_operator; }
	}

	public final Arithmetic_operatorContext arithmetic_operator() throws RecognitionException {
		Arithmetic_operatorContext _localctx = new Arithmetic_operatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arithmetic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Logic_operatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(tinycParser.AND, 0); }
		public TerminalNode OR() { return getToken(tinycParser.OR, 0); }
		public TerminalNode NOT() { return getToken(tinycParser.NOT, 0); }
		public Logic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_operator; }
	}

	public final Logic_operatorContext logic_operator() throws RecognitionException {
		Logic_operatorContext _localctx = new Logic_operatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Comparison_operatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(tinycParser.EQ, 0); }
		public TerminalNode LT() { return getToken(tinycParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(tinycParser.LEQ, 0); }
		public TerminalNode GT() { return getToken(tinycParser.GT, 0); }
		public TerminalNode GEQ() { return getToken(tinycParser.GEQ, 0); }
		public TerminalNode NEQ() { return getToken(tinycParser.NEQ, 0); }
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparison_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LT) | (1L << LEQ) | (1L << GT) | (1L << GEQ) | (1L << NEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return arith_sempred((ArithContext)_localctx, predIndex);
		case 11:
			return relation_sempred((RelationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arith_sempred(ArithContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean relation_sempred(RelationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00a0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\67\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\5\7H\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bS\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\ti\n\t\3\n\3\n\3\n\5\nn\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fx\n"+
		"\f\3\f\3\f\3\f\3\f\7\f~\n\f\f\f\16\f\u0081\13\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u0089\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0093\n\r\f\r\16"+
		"\r\u0096\13\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\2\4\26\30\22"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\5\3\2\17\23\3\2\24\26\3\2\27"+
		"\34\2\u009e\2\"\3\2\2\2\4)\3\2\2\2\6\66\3\2\2\2\b8\3\2\2\2\n@\3\2\2\2"+
		"\fG\3\2\2\2\16R\3\2\2\2\20h\3\2\2\2\22m\3\2\2\2\24o\3\2\2\2\26w\3\2\2"+
		"\2\30\u0088\3\2\2\2\32\u0097\3\2\2\2\34\u0099\3\2\2\2\36\u009b\3\2\2\2"+
		" \u009d\3\2\2\2\"#\5\4\3\2#$\7\2\2\3$\3\3\2\2\2%*\5\6\4\2&\'\5\6\4\2\'"+
		"(\5\4\3\2(*\3\2\2\2)%\3\2\2\2)&\3\2\2\2*\5\3\2\2\2+,\5\n\6\2,-\7\3\2\2"+
		"-\67\3\2\2\2./\5\f\7\2/\60\7\3\2\2\60\67\3\2\2\2\61\67\5\20\t\2\62\63"+
		"\5\16\b\2\63\64\7\3\2\2\64\67\3\2\2\2\65\67\5\b\5\2\66+\3\2\2\2\66.\3"+
		"\2\2\2\66\61\3\2\2\2\66\62\3\2\2\2\66\65\3\2\2\2\67\7\3\2\2\289\7\4\2"+
		"\29:\7\5\2\2:;\5\30\r\2;<\7\6\2\2<=\7\7\2\2=>\5\4\3\2>?\7\b\2\2?\t\3\2"+
		"\2\2@A\7\t\2\2AB\7\35\2\2B\13\3\2\2\2CD\7\35\2\2DE\7\n\2\2EH\5\26\f\2"+
		"FH\5\30\r\2GC\3\2\2\2GF\3\2\2\2H\r\3\2\2\2IJ\7\13\2\2JK\7\5\2\2KL\5\22"+
		"\n\2LM\7\6\2\2MS\3\2\2\2NO\7\13\2\2OP\7\5\2\2PQ\7\37\2\2QS\7\6\2\2RI\3"+
		"\2\2\2RN\3\2\2\2S\17\3\2\2\2TU\7\f\2\2UV\7\5\2\2VW\5\30\r\2WX\7\6\2\2"+
		"XY\7\7\2\2YZ\5\4\3\2Z[\7\b\2\2[i\3\2\2\2\\]\7\f\2\2]^\7\5\2\2^_\5\30\r"+
		"\2_`\7\6\2\2`a\7\7\2\2ab\5\4\3\2bc\7\b\2\2cd\7\r\2\2de\7\7\2\2ef\5\4\3"+
		"\2fg\7\b\2\2gi\3\2\2\2hT\3\2\2\2h\\\3\2\2\2i\21\3\2\2\2jn\7\36\2\2kn\7"+
		"\35\2\2ln\5\32\16\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\23\3\2\2\2op\7\16\2"+
		"\2p\25\3\2\2\2qr\b\f\1\2rx\5\22\n\2st\7\5\2\2tu\5\26\f\2uv\7\6\2\2vx\3"+
		"\2\2\2wq\3\2\2\2ws\3\2\2\2x\177\3\2\2\2yz\f\4\2\2z{\5\34\17\2{|\5\26\f"+
		"\5|~\3\2\2\2}y\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\27\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\b\r\1\2\u0083\u0089\5\26\f\2"+
		"\u0084\u0085\7\5\2\2\u0085\u0086\5\30\r\2\u0086\u0087\7\6\2\2\u0087\u0089"+
		"\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0084\3\2\2\2\u0089\u0094\3\2\2\2\u008a"+
		"\u008b\f\5\2\2\u008b\u008c\5\36\20\2\u008c\u008d\5\30\r\6\u008d\u0093"+
		"\3\2\2\2\u008e\u008f\f\4\2\2\u008f\u0090\5 \21\2\u0090\u0091\5\30\r\5"+
		"\u0091\u0093\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u008e\3\2\2\2\u0093\u0096"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\31\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u0098\5\24\13\2\u0098\33\3\2\2\2\u0099\u009a\t\2"+
		"\2\2\u009a\35\3\2\2\2\u009b\u009c\t\3\2\2\u009c\37\3\2\2\2\u009d\u009e"+
		"\t\4\2\2\u009e!\3\2\2\2\r)\66GRhmw\177\u0088\u0092\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}