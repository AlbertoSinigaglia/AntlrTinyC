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
		RULE_arith = 10, RULE_arith_expr = 11, RULE_relation = 12, RULE_input = 13, 
		RULE_arithmetic_operator = 14, RULE_logic_operator = 15, RULE_comparison_operator = 16;
	public static final String[] ruleNames = {
		"start", "program", "statement", "loop", "decl", "assign", "out", "branch", 
		"expr", "read", "arith", "arith_expr", "relation", "input", "arithmetic_operator", 
		"logic_operator", "comparison_operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'while'", "'('", "')'", "'{'", "'}'", "'int'", "'='", "'write'", 
		"'if'", "'else'", "'read'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", 
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
			setState(34);
			program();
			setState(35);
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
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				statement();
				setState(39);
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
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				decl();
				setState(44);
				match(T__0);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				assign();
				setState(47);
				match(T__0);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				branch();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				out();
				setState(51);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
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
			setState(56);
			match(T__1);
			setState(57);
			match(T__2);
			setState(58);
			relation(0);
			setState(59);
			match(T__3);
			setState(60);
			match(T__4);
			setState(61);
			program();
			setState(62);
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
			setState(64);
			match(T__6);
			setState(65);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ID);
			setState(68);
			match(T__7);
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(69);
				expr();
				}
				break;
			case 2:
				{
				setState(70);
				arith(0);
				}
				break;
			case 3:
				{
				setState(71);
				relation(0);
				}
				break;
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
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(T__8);
				setState(75);
				match(T__2);
				setState(76);
				expr();
				setState(77);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(T__8);
				setState(80);
				match(T__2);
				setState(81);
				match(STRING);
				setState(82);
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
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(T__9);
				setState(86);
				match(T__2);
				setState(87);
				relation(0);
				setState(88);
				match(T__3);
				setState(89);
				match(T__4);
				setState(90);
				program();
				setState(91);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(T__9);
				setState(94);
				match(T__2);
				setState(95);
				relation(0);
				setState(96);
				match(T__3);
				setState(97);
				match(T__4);
				setState(98);
				program();
				setState(99);
				match(T__5);
				setState(100);
				match(T__10);
				setState(101);
				match(T__4);
				setState(102);
				program();
				setState(103);
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
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(NUMBER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(ID);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
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
			setState(112);
			match(T__11);
			setState(113);
			match(T__2);
			setState(114);
			match(T__3);
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
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case ID:
			case NUMBER:
				{
				setState(117);
				expr();
				}
				break;
			case T__2:
				{
				setState(118);
				match(T__2);
				setState(119);
				arith(0);
				setState(120);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
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
					setState(124);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(125);
					arithmetic_operator();
					setState(126);
					arith(3);
					}
					} 
				}
				setState(132);
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

	public static class Arith_exprContext extends ParserRuleContext {
		public ArithContext arith() {
			return getRuleContext(ArithContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Arith_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expr; }
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arith_expr);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				arith(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				expr();
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

	public static class RelationContext extends ParserRuleContext {
		public List<Arith_exprContext> arith_expr() {
			return getRuleContexts(Arith_exprContext.class);
		}
		public Arith_exprContext arith_expr(int i) {
			return getRuleContext(Arith_exprContext.class,i);
		}
		public Arithmetic_operatorContext arithmetic_operator() {
			return getRuleContext(Arithmetic_operatorContext.class,0);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_relation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(138);
				arith_expr();
				setState(139);
				arithmetic_operator();
				setState(140);
				arith_expr();
				}
				break;
			case 2:
				{
				setState(142);
				arith_expr();
				setState(143);
				comparison_operator();
				setState(144);
				arith_expr();
				}
				break;
			case 3:
				{
				setState(146);
				match(T__2);
				setState(147);
				relation(0);
				setState(148);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relation);
					setState(152);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(153);
					logic_operator();
					setState(154);
					relation(4);
					}
					} 
				}
				setState(160);
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
		enterRule(_localctx, 26, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
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
		enterRule(_localctx, 28, RULE_arithmetic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
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
		enterRule(_localctx, 30, RULE_logic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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
		enterRule(_localctx, 32, RULE_comparison_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
		case 12:
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
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\5\7K\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bV\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\tl\n\t\3\n\3\n\3\n\5\nq\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f}\n\f\3\f\3\f\3\f\3\f\7\f\u0083\n\f\f\f\16\f\u0086\13"+
		"\f\3\r\3\r\5\r\u008a\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0099\n\16\3\16\3\16\3\16\3\16\7\16\u009f\n"+
		"\16\f\16\16\16\u00a2\13\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\2\4\26\32\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\5\3\2\17\23"+
		"\3\2\24\26\3\2\27\34\2\u00ab\2$\3\2\2\2\4+\3\2\2\2\68\3\2\2\2\b:\3\2\2"+
		"\2\nB\3\2\2\2\fE\3\2\2\2\16U\3\2\2\2\20k\3\2\2\2\22p\3\2\2\2\24r\3\2\2"+
		"\2\26|\3\2\2\2\30\u0089\3\2\2\2\32\u0098\3\2\2\2\34\u00a3\3\2\2\2\36\u00a5"+
		"\3\2\2\2 \u00a7\3\2\2\2\"\u00a9\3\2\2\2$%\5\4\3\2%&\7\2\2\3&\3\3\2\2\2"+
		"\',\5\6\4\2()\5\6\4\2)*\5\4\3\2*,\3\2\2\2+\'\3\2\2\2+(\3\2\2\2,\5\3\2"+
		"\2\2-.\5\n\6\2./\7\3\2\2/9\3\2\2\2\60\61\5\f\7\2\61\62\7\3\2\2\629\3\2"+
		"\2\2\639\5\20\t\2\64\65\5\16\b\2\65\66\7\3\2\2\669\3\2\2\2\679\5\b\5\2"+
		"8-\3\2\2\28\60\3\2\2\28\63\3\2\2\28\64\3\2\2\28\67\3\2\2\29\7\3\2\2\2"+
		":;\7\4\2\2;<\7\5\2\2<=\5\32\16\2=>\7\6\2\2>?\7\7\2\2?@\5\4\3\2@A\7\b\2"+
		"\2A\t\3\2\2\2BC\7\t\2\2CD\7\35\2\2D\13\3\2\2\2EF\7\35\2\2FJ\7\n\2\2GK"+
		"\5\22\n\2HK\5\26\f\2IK\5\32\16\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\r\3\2"+
		"\2\2LM\7\13\2\2MN\7\5\2\2NO\5\22\n\2OP\7\6\2\2PV\3\2\2\2QR\7\13\2\2RS"+
		"\7\5\2\2ST\7\37\2\2TV\7\6\2\2UL\3\2\2\2UQ\3\2\2\2V\17\3\2\2\2WX\7\f\2"+
		"\2XY\7\5\2\2YZ\5\32\16\2Z[\7\6\2\2[\\\7\7\2\2\\]\5\4\3\2]^\7\b\2\2^l\3"+
		"\2\2\2_`\7\f\2\2`a\7\5\2\2ab\5\32\16\2bc\7\6\2\2cd\7\7\2\2de\5\4\3\2e"+
		"f\7\b\2\2fg\7\r\2\2gh\7\7\2\2hi\5\4\3\2ij\7\b\2\2jl\3\2\2\2kW\3\2\2\2"+
		"k_\3\2\2\2l\21\3\2\2\2mq\7\36\2\2nq\7\35\2\2oq\5\34\17\2pm\3\2\2\2pn\3"+
		"\2\2\2po\3\2\2\2q\23\3\2\2\2rs\7\16\2\2st\7\5\2\2tu\7\6\2\2u\25\3\2\2"+
		"\2vw\b\f\1\2w}\5\22\n\2xy\7\5\2\2yz\5\26\f\2z{\7\6\2\2{}\3\2\2\2|v\3\2"+
		"\2\2|x\3\2\2\2}\u0084\3\2\2\2~\177\f\4\2\2\177\u0080\5\36\20\2\u0080\u0081"+
		"\5\26\f\5\u0081\u0083\3\2\2\2\u0082~\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\27\3\2\2\2\u0086\u0084\3\2\2"+
		"\2\u0087\u008a\5\26\f\2\u0088\u008a\5\22\n\2\u0089\u0087\3\2\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\31\3\2\2\2\u008b\u008c\b\16\1\2\u008c\u008d\5\30"+
		"\r\2\u008d\u008e\5\36\20\2\u008e\u008f\5\30\r\2\u008f\u0099\3\2\2\2\u0090"+
		"\u0091\5\30\r\2\u0091\u0092\5\"\22\2\u0092\u0093\5\30\r\2\u0093\u0099"+
		"\3\2\2\2\u0094\u0095\7\5\2\2\u0095\u0096\5\32\16\2\u0096\u0097\7\6\2\2"+
		"\u0097\u0099\3\2\2\2\u0098\u008b\3\2\2\2\u0098\u0090\3\2\2\2\u0098\u0094"+
		"\3\2\2\2\u0099\u00a0\3\2\2\2\u009a\u009b\f\5\2\2\u009b\u009c\5 \21\2\u009c"+
		"\u009d\5\32\16\6\u009d\u009f\3\2\2\2\u009e\u009a\3\2\2\2\u009f\u00a2\3"+
		"\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\33\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a4\5\24\13\2\u00a4\35\3\2\2\2\u00a5\u00a6\t\2"+
		"\2\2\u00a6\37\3\2\2\2\u00a7\u00a8\t\3\2\2\u00a8!\3\2\2\2\u00a9\u00aa\t"+
		"\4\2\2\u00aa#\3\2\2\2\r+8JUkp|\u0084\u0089\u0098\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}