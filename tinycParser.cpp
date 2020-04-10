
// Generated from tinyc.g4 by ANTLR 4.7.2


#include "tinycListener.h"

#include "tinycParser.h"


using namespace antlrcpp;
using namespace antlr4;

tinycParser::tinycParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

tinycParser::~tinycParser() {
  delete _interpreter;
}

std::string tinycParser::getGrammarFileName() const {
  return "tinyc.g4";
}

const std::vector<std::string>& tinycParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& tinycParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- StartContext ------------------------------------------------------------------

tinycParser::StartContext::StartContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tinycParser::ProgramContext* tinycParser::StartContext::program() {
  return getRuleContext<tinycParser::ProgramContext>(0);
}

tree::TerminalNode* tinycParser::StartContext::EOF() {
  return getToken(tinycParser::EOF, 0);
}


size_t tinycParser::StartContext::getRuleIndex() const {
  return tinycParser::RuleStart;
}

void tinycParser::StartContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterStart(this);
}

void tinycParser::StartContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitStart(this);
}

tinycParser::StartContext* tinycParser::start() {
  StartContext *_localctx = _tracker.createInstance<StartContext>(_ctx, getState());
  enterRule(_localctx, 0, tinycParser::RuleStart);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(32);
    program();
    setState(33);
    match(tinycParser::EOF);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ProgramContext ------------------------------------------------------------------

tinycParser::ProgramContext::ProgramContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tinycParser::StatementContext* tinycParser::ProgramContext::statement() {
  return getRuleContext<tinycParser::StatementContext>(0);
}

tinycParser::ProgramContext* tinycParser::ProgramContext::program() {
  return getRuleContext<tinycParser::ProgramContext>(0);
}


size_t tinycParser::ProgramContext::getRuleIndex() const {
  return tinycParser::RuleProgram;
}

void tinycParser::ProgramContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterProgram(this);
}

void tinycParser::ProgramContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitProgram(this);
}

tinycParser::ProgramContext* tinycParser::program() {
  ProgramContext *_localctx = _tracker.createInstance<ProgramContext>(_ctx, getState());
  enterRule(_localctx, 2, tinycParser::RuleProgram);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(39);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 0, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(35);
      statement();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(36);
      statement();
      setState(37);
      program();
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StatementContext ------------------------------------------------------------------

tinycParser::StatementContext::StatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tinycParser::DeclContext* tinycParser::StatementContext::decl() {
  return getRuleContext<tinycParser::DeclContext>(0);
}

tinycParser::AssignContext* tinycParser::StatementContext::assign() {
  return getRuleContext<tinycParser::AssignContext>(0);
}

tinycParser::BranchContext* tinycParser::StatementContext::branch() {
  return getRuleContext<tinycParser::BranchContext>(0);
}

tinycParser::OutContext* tinycParser::StatementContext::out() {
  return getRuleContext<tinycParser::OutContext>(0);
}

tinycParser::LoopContext* tinycParser::StatementContext::loop() {
  return getRuleContext<tinycParser::LoopContext>(0);
}


size_t tinycParser::StatementContext::getRuleIndex() const {
  return tinycParser::RuleStatement;
}

void tinycParser::StatementContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterStatement(this);
}

void tinycParser::StatementContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitStatement(this);
}

tinycParser::StatementContext* tinycParser::statement() {
  StatementContext *_localctx = _tracker.createInstance<StatementContext>(_ctx, getState());
  enterRule(_localctx, 4, tinycParser::RuleStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(52);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case tinycParser::T__6: {
        enterOuterAlt(_localctx, 1);
        setState(41);
        decl();
        setState(42);
        match(tinycParser::T__0);
        break;
      }

      case tinycParser::T__2:
      case tinycParser::T__11:
      case tinycParser::ID:
      case tinycParser::NUMBER: {
        enterOuterAlt(_localctx, 2);
        setState(44);
        assign();
        setState(45);
        match(tinycParser::T__0);
        break;
      }

      case tinycParser::T__9: {
        enterOuterAlt(_localctx, 3);
        setState(47);
        branch();
        break;
      }

      case tinycParser::T__8: {
        enterOuterAlt(_localctx, 4);
        setState(48);
        out();
        setState(49);
        match(tinycParser::T__0);
        break;
      }

      case tinycParser::T__1: {
        enterOuterAlt(_localctx, 5);
        setState(51);
        loop();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LoopContext ------------------------------------------------------------------

tinycParser::LoopContext::LoopContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tinycParser::RelationContext* tinycParser::LoopContext::relation() {
  return getRuleContext<tinycParser::RelationContext>(0);
}

tinycParser::ProgramContext* tinycParser::LoopContext::program() {
  return getRuleContext<tinycParser::ProgramContext>(0);
}


size_t tinycParser::LoopContext::getRuleIndex() const {
  return tinycParser::RuleLoop;
}

void tinycParser::LoopContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoop(this);
}

void tinycParser::LoopContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoop(this);
}

tinycParser::LoopContext* tinycParser::loop() {
  LoopContext *_localctx = _tracker.createInstance<LoopContext>(_ctx, getState());
  enterRule(_localctx, 6, tinycParser::RuleLoop);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(54);
    match(tinycParser::T__1);
    setState(55);
    match(tinycParser::T__2);
    setState(56);
    relation(0);
    setState(57);
    match(tinycParser::T__3);
    setState(58);
    match(tinycParser::T__4);
    setState(59);
    program();
    setState(60);
    match(tinycParser::T__5);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- DeclContext ------------------------------------------------------------------

tinycParser::DeclContext::DeclContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* tinycParser::DeclContext::ID() {
  return getToken(tinycParser::ID, 0);
}


size_t tinycParser::DeclContext::getRuleIndex() const {
  return tinycParser::RuleDecl;
}

void tinycParser::DeclContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterDecl(this);
}

void tinycParser::DeclContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitDecl(this);
}

tinycParser::DeclContext* tinycParser::decl() {
  DeclContext *_localctx = _tracker.createInstance<DeclContext>(_ctx, getState());
  enterRule(_localctx, 8, tinycParser::RuleDecl);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(62);
    match(tinycParser::T__6);
    setState(63);
    match(tinycParser::ID);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AssignContext ------------------------------------------------------------------

tinycParser::AssignContext::AssignContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* tinycParser::AssignContext::ID() {
  return getToken(tinycParser::ID, 0);
}

tinycParser::ArithContext* tinycParser::AssignContext::arith() {
  return getRuleContext<tinycParser::ArithContext>(0);
}

tinycParser::RelationContext* tinycParser::AssignContext::relation() {
  return getRuleContext<tinycParser::RelationContext>(0);
}


size_t tinycParser::AssignContext::getRuleIndex() const {
  return tinycParser::RuleAssign;
}

void tinycParser::AssignContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAssign(this);
}

void tinycParser::AssignContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAssign(this);
}

tinycParser::AssignContext* tinycParser::assign() {
  AssignContext *_localctx = _tracker.createInstance<AssignContext>(_ctx, getState());
  enterRule(_localctx, 10, tinycParser::RuleAssign);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(69);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(65);
      match(tinycParser::ID);
      setState(66);
      match(tinycParser::T__7);
      setState(67);
      arith(0);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(68);
      relation(0);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- OutContext ------------------------------------------------------------------

tinycParser::OutContext::OutContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tinycParser::ExprContext* tinycParser::OutContext::expr() {
  return getRuleContext<tinycParser::ExprContext>(0);
}

tree::TerminalNode* tinycParser::OutContext::STRING() {
  return getToken(tinycParser::STRING, 0);
}


size_t tinycParser::OutContext::getRuleIndex() const {
  return tinycParser::RuleOut;
}

void tinycParser::OutContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterOut(this);
}

void tinycParser::OutContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitOut(this);
}

tinycParser::OutContext* tinycParser::out() {
  OutContext *_localctx = _tracker.createInstance<OutContext>(_ctx, getState());
  enterRule(_localctx, 12, tinycParser::RuleOut);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(80);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 3, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(71);
      match(tinycParser::T__8);
      setState(72);
      match(tinycParser::T__2);
      setState(73);
      expr();
      setState(74);
      match(tinycParser::T__3);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(76);
      match(tinycParser::T__8);
      setState(77);
      match(tinycParser::T__2);
      setState(78);
      match(tinycParser::STRING);
      setState(79);
      match(tinycParser::T__3);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BranchContext ------------------------------------------------------------------

tinycParser::BranchContext::BranchContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tinycParser::RelationContext* tinycParser::BranchContext::relation() {
  return getRuleContext<tinycParser::RelationContext>(0);
}

std::vector<tinycParser::ProgramContext *> tinycParser::BranchContext::program() {
  return getRuleContexts<tinycParser::ProgramContext>();
}

tinycParser::ProgramContext* tinycParser::BranchContext::program(size_t i) {
  return getRuleContext<tinycParser::ProgramContext>(i);
}


size_t tinycParser::BranchContext::getRuleIndex() const {
  return tinycParser::RuleBranch;
}

void tinycParser::BranchContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBranch(this);
}

void tinycParser::BranchContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBranch(this);
}

tinycParser::BranchContext* tinycParser::branch() {
  BranchContext *_localctx = _tracker.createInstance<BranchContext>(_ctx, getState());
  enterRule(_localctx, 14, tinycParser::RuleBranch);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(102);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(82);
      match(tinycParser::T__9);
      setState(83);
      match(tinycParser::T__2);
      setState(84);
      relation(0);
      setState(85);
      match(tinycParser::T__3);
      setState(86);
      match(tinycParser::T__4);
      setState(87);
      program();
      setState(88);
      match(tinycParser::T__5);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(90);
      match(tinycParser::T__9);
      setState(91);
      match(tinycParser::T__2);
      setState(92);
      relation(0);
      setState(93);
      match(tinycParser::T__3);
      setState(94);
      match(tinycParser::T__4);
      setState(95);
      program();
      setState(96);
      match(tinycParser::T__5);
      setState(97);
      match(tinycParser::T__10);
      setState(98);
      match(tinycParser::T__4);
      setState(99);
      program();
      setState(100);
      match(tinycParser::T__5);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExprContext ------------------------------------------------------------------

tinycParser::ExprContext::ExprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* tinycParser::ExprContext::NUMBER() {
  return getToken(tinycParser::NUMBER, 0);
}

tree::TerminalNode* tinycParser::ExprContext::ID() {
  return getToken(tinycParser::ID, 0);
}

tinycParser::InputContext* tinycParser::ExprContext::input() {
  return getRuleContext<tinycParser::InputContext>(0);
}


size_t tinycParser::ExprContext::getRuleIndex() const {
  return tinycParser::RuleExpr;
}

void tinycParser::ExprContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterExpr(this);
}

void tinycParser::ExprContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitExpr(this);
}

tinycParser::ExprContext* tinycParser::expr() {
  ExprContext *_localctx = _tracker.createInstance<ExprContext>(_ctx, getState());
  enterRule(_localctx, 16, tinycParser::RuleExpr);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(107);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case tinycParser::NUMBER: {
        enterOuterAlt(_localctx, 1);
        setState(104);
        match(tinycParser::NUMBER);
        break;
      }

      case tinycParser::ID: {
        enterOuterAlt(_localctx, 2);
        setState(105);
        match(tinycParser::ID);
        break;
      }

      case tinycParser::T__11: {
        enterOuterAlt(_localctx, 3);
        setState(106);
        input();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ReadContext ------------------------------------------------------------------

tinycParser::ReadContext::ReadContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t tinycParser::ReadContext::getRuleIndex() const {
  return tinycParser::RuleRead;
}

void tinycParser::ReadContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterRead(this);
}

void tinycParser::ReadContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitRead(this);
}

tinycParser::ReadContext* tinycParser::read() {
  ReadContext *_localctx = _tracker.createInstance<ReadContext>(_ctx, getState());
  enterRule(_localctx, 18, tinycParser::RuleRead);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(109);
    match(tinycParser::T__11);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ArithContext ------------------------------------------------------------------

tinycParser::ArithContext::ArithContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tinycParser::ExprContext* tinycParser::ArithContext::expr() {
  return getRuleContext<tinycParser::ExprContext>(0);
}

std::vector<tinycParser::ArithContext *> tinycParser::ArithContext::arith() {
  return getRuleContexts<tinycParser::ArithContext>();
}

tinycParser::ArithContext* tinycParser::ArithContext::arith(size_t i) {
  return getRuleContext<tinycParser::ArithContext>(i);
}

tinycParser::Arithmetic_operatorContext* tinycParser::ArithContext::arithmetic_operator() {
  return getRuleContext<tinycParser::Arithmetic_operatorContext>(0);
}


size_t tinycParser::ArithContext::getRuleIndex() const {
  return tinycParser::RuleArith;
}

void tinycParser::ArithContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterArith(this);
}

void tinycParser::ArithContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitArith(this);
}


tinycParser::ArithContext* tinycParser::arith() {
   return arith(0);
}

tinycParser::ArithContext* tinycParser::arith(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  tinycParser::ArithContext *_localctx = _tracker.createInstance<ArithContext>(_ctx, parentState);
  tinycParser::ArithContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 20;
  enterRecursionRule(_localctx, 20, tinycParser::RuleArith, precedence);

    

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(117);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case tinycParser::T__11:
      case tinycParser::ID:
      case tinycParser::NUMBER: {
        setState(112);
        expr();
        break;
      }

      case tinycParser::T__2: {
        setState(113);
        match(tinycParser::T__2);
        setState(114);
        arith(0);
        setState(115);
        match(tinycParser::T__3);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
    _ctx->stop = _input->LT(-1);
    setState(125);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        _localctx = _tracker.createInstance<ArithContext>(parentContext, parentState);
        pushNewRecursionContext(_localctx, startState, RuleArith);
        setState(119);

        if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
        setState(120);
        arithmetic_operator();
        setState(121);
        arith(3); 
      }
      setState(127);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- RelationContext ------------------------------------------------------------------

tinycParser::RelationContext::RelationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tinycParser::ArithContext* tinycParser::RelationContext::arith() {
  return getRuleContext<tinycParser::ArithContext>(0);
}

std::vector<tinycParser::RelationContext *> tinycParser::RelationContext::relation() {
  return getRuleContexts<tinycParser::RelationContext>();
}

tinycParser::RelationContext* tinycParser::RelationContext::relation(size_t i) {
  return getRuleContext<tinycParser::RelationContext>(i);
}

tinycParser::Logic_operatorContext* tinycParser::RelationContext::logic_operator() {
  return getRuleContext<tinycParser::Logic_operatorContext>(0);
}

tinycParser::Comparison_operatorContext* tinycParser::RelationContext::comparison_operator() {
  return getRuleContext<tinycParser::Comparison_operatorContext>(0);
}


size_t tinycParser::RelationContext::getRuleIndex() const {
  return tinycParser::RuleRelation;
}

void tinycParser::RelationContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterRelation(this);
}

void tinycParser::RelationContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitRelation(this);
}


tinycParser::RelationContext* tinycParser::relation() {
   return relation(0);
}

tinycParser::RelationContext* tinycParser::relation(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  tinycParser::RelationContext *_localctx = _tracker.createInstance<RelationContext>(_ctx, parentState);
  tinycParser::RelationContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 22;
  enterRecursionRule(_localctx, 22, tinycParser::RuleRelation, precedence);

    

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(134);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 8, _ctx)) {
    case 1: {
      setState(129);
      arith(0);
      break;
    }

    case 2: {
      setState(130);
      match(tinycParser::T__2);
      setState(131);
      relation(0);
      setState(132);
      match(tinycParser::T__3);
      break;
    }

    }
    _ctx->stop = _input->LT(-1);
    setState(146);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        setState(144);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 9, _ctx)) {
        case 1: {
          _localctx = _tracker.createInstance<RelationContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleRelation);
          setState(136);

          if (!(precpred(_ctx, 3))) throw FailedPredicateException(this, "precpred(_ctx, 3)");
          setState(137);
          logic_operator();
          setState(138);
          relation(4);
          break;
        }

        case 2: {
          _localctx = _tracker.createInstance<RelationContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleRelation);
          setState(140);

          if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
          setState(141);
          comparison_operator();
          setState(142);
          relation(3);
          break;
        }

        } 
      }
      setState(148);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- InputContext ------------------------------------------------------------------

tinycParser::InputContext::InputContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tinycParser::ReadContext* tinycParser::InputContext::read() {
  return getRuleContext<tinycParser::ReadContext>(0);
}


size_t tinycParser::InputContext::getRuleIndex() const {
  return tinycParser::RuleInput;
}

void tinycParser::InputContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterInput(this);
}

void tinycParser::InputContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitInput(this);
}

tinycParser::InputContext* tinycParser::input() {
  InputContext *_localctx = _tracker.createInstance<InputContext>(_ctx, getState());
  enterRule(_localctx, 24, tinycParser::RuleInput);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(149);
    read();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Arithmetic_operatorContext ------------------------------------------------------------------

tinycParser::Arithmetic_operatorContext::Arithmetic_operatorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* tinycParser::Arithmetic_operatorContext::ADD() {
  return getToken(tinycParser::ADD, 0);
}

tree::TerminalNode* tinycParser::Arithmetic_operatorContext::SUB() {
  return getToken(tinycParser::SUB, 0);
}

tree::TerminalNode* tinycParser::Arithmetic_operatorContext::MUL() {
  return getToken(tinycParser::MUL, 0);
}

tree::TerminalNode* tinycParser::Arithmetic_operatorContext::DIV() {
  return getToken(tinycParser::DIV, 0);
}

tree::TerminalNode* tinycParser::Arithmetic_operatorContext::MOD() {
  return getToken(tinycParser::MOD, 0);
}


size_t tinycParser::Arithmetic_operatorContext::getRuleIndex() const {
  return tinycParser::RuleArithmetic_operator;
}

void tinycParser::Arithmetic_operatorContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterArithmetic_operator(this);
}

void tinycParser::Arithmetic_operatorContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitArithmetic_operator(this);
}

tinycParser::Arithmetic_operatorContext* tinycParser::arithmetic_operator() {
  Arithmetic_operatorContext *_localctx = _tracker.createInstance<Arithmetic_operatorContext>(_ctx, getState());
  enterRule(_localctx, 26, tinycParser::RuleArithmetic_operator);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(151);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << tinycParser::ADD)
      | (1ULL << tinycParser::SUB)
      | (1ULL << tinycParser::MUL)
      | (1ULL << tinycParser::DIV)
      | (1ULL << tinycParser::MOD))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Logic_operatorContext ------------------------------------------------------------------

tinycParser::Logic_operatorContext::Logic_operatorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* tinycParser::Logic_operatorContext::AND() {
  return getToken(tinycParser::AND, 0);
}

tree::TerminalNode* tinycParser::Logic_operatorContext::OR() {
  return getToken(tinycParser::OR, 0);
}

tree::TerminalNode* tinycParser::Logic_operatorContext::NOT() {
  return getToken(tinycParser::NOT, 0);
}


size_t tinycParser::Logic_operatorContext::getRuleIndex() const {
  return tinycParser::RuleLogic_operator;
}

void tinycParser::Logic_operatorContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLogic_operator(this);
}

void tinycParser::Logic_operatorContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLogic_operator(this);
}

tinycParser::Logic_operatorContext* tinycParser::logic_operator() {
  Logic_operatorContext *_localctx = _tracker.createInstance<Logic_operatorContext>(_ctx, getState());
  enterRule(_localctx, 28, tinycParser::RuleLogic_operator);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(153);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << tinycParser::AND)
      | (1ULL << tinycParser::OR)
      | (1ULL << tinycParser::NOT))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Comparison_operatorContext ------------------------------------------------------------------

tinycParser::Comparison_operatorContext::Comparison_operatorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* tinycParser::Comparison_operatorContext::EQ() {
  return getToken(tinycParser::EQ, 0);
}

tree::TerminalNode* tinycParser::Comparison_operatorContext::LT() {
  return getToken(tinycParser::LT, 0);
}

tree::TerminalNode* tinycParser::Comparison_operatorContext::LEQ() {
  return getToken(tinycParser::LEQ, 0);
}

tree::TerminalNode* tinycParser::Comparison_operatorContext::GT() {
  return getToken(tinycParser::GT, 0);
}

tree::TerminalNode* tinycParser::Comparison_operatorContext::GEQ() {
  return getToken(tinycParser::GEQ, 0);
}

tree::TerminalNode* tinycParser::Comparison_operatorContext::NEQ() {
  return getToken(tinycParser::NEQ, 0);
}


size_t tinycParser::Comparison_operatorContext::getRuleIndex() const {
  return tinycParser::RuleComparison_operator;
}

void tinycParser::Comparison_operatorContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterComparison_operator(this);
}

void tinycParser::Comparison_operatorContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<tinycListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitComparison_operator(this);
}

tinycParser::Comparison_operatorContext* tinycParser::comparison_operator() {
  Comparison_operatorContext *_localctx = _tracker.createInstance<Comparison_operatorContext>(_ctx, getState());
  enterRule(_localctx, 30, tinycParser::RuleComparison_operator);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(155);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << tinycParser::EQ)
      | (1ULL << tinycParser::LT)
      | (1ULL << tinycParser::LEQ)
      | (1ULL << tinycParser::GT)
      | (1ULL << tinycParser::GEQ)
      | (1ULL << tinycParser::NEQ))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

bool tinycParser::sempred(RuleContext *context, size_t ruleIndex, size_t predicateIndex) {
  switch (ruleIndex) {
    case 10: return arithSempred(dynamic_cast<ArithContext *>(context), predicateIndex);
    case 11: return relationSempred(dynamic_cast<RelationContext *>(context), predicateIndex);

  default:
    break;
  }
  return true;
}

bool tinycParser::arithSempred(ArithContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 0: return precpred(_ctx, 2);

  default:
    break;
  }
  return true;
}

bool tinycParser::relationSempred(RelationContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 1: return precpred(_ctx, 3);
    case 2: return precpred(_ctx, 2);

  default:
    break;
  }
  return true;
}

// Static vars and initialization.
std::vector<dfa::DFA> tinycParser::_decisionToDFA;
atn::PredictionContextCache tinycParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN tinycParser::_atn;
std::vector<uint16_t> tinycParser::_serializedATN;

std::vector<std::string> tinycParser::_ruleNames = {
  "start", "program", "statement", "loop", "decl", "assign", "out", "branch", 
  "expr", "read", "arith", "relation", "input", "arithmetic_operator", "logic_operator", 
  "comparison_operator"
};

std::vector<std::string> tinycParser::_literalNames = {
  "", "';'", "'while'", "'('", "')'", "'{'", "'}'", "'int'", "'='", "'write'", 
  "'if'", "'else'", "'read()'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", 
  "'||'", "'!'", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='"
};

std::vector<std::string> tinycParser::_symbolicNames = {
  "", "", "", "", "", "", "", "", "", "", "", "", "", "ADD", "SUB", "MUL", 
  "DIV", "MOD", "AND", "OR", "NOT", "EQ", "LT", "LEQ", "GT", "GEQ", "NEQ", 
  "ID", "NUMBER", "STRING", "COMMENT", "LINE_COMMENT", "WS", "ErrorChar"
};

dfa::Vocabulary tinycParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> tinycParser::_tokenNames;

tinycParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  _serializedATN = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
    0x3, 0x23, 0xa0, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 0x9, 
    0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 0x7, 0x4, 
    0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 0x4, 0xb, 0x9, 
    0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 0xe, 0x9, 0xe, 0x4, 
    0xf, 0x9, 0xf, 0x4, 0x10, 0x9, 0x10, 0x4, 0x11, 0x9, 0x11, 0x3, 0x2, 
    0x3, 0x2, 0x3, 0x2, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x5, 0x3, 
    0x2a, 0xa, 0x3, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 
    0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x5, 0x4, 0x37, 
    0xa, 0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 
    0x3, 0x5, 0x3, 0x5, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x7, 0x3, 0x7, 
    0x3, 0x7, 0x3, 0x7, 0x5, 0x7, 0x48, 0xa, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 
    0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x5, 
    0x8, 0x53, 0xa, 0x8, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 
    0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 
    0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 
    0x3, 0x9, 0x5, 0x9, 0x69, 0xa, 0x9, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x5, 
    0xa, 0x6e, 0xa, 0xa, 0x3, 0xb, 0x3, 0xb, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 
    0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x5, 0xc, 0x78, 0xa, 0xc, 0x3, 0xc, 0x3, 
    0xc, 0x3, 0xc, 0x3, 0xc, 0x7, 0xc, 0x7e, 0xa, 0xc, 0xc, 0xc, 0xe, 0xc, 
    0x81, 0xb, 0xc, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 
    0xd, 0x5, 0xd, 0x89, 0xa, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
    0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x7, 0xd, 0x93, 0xa, 0xd, 0xc, 
    0xd, 0xe, 0xd, 0x96, 0xb, 0xd, 0x3, 0xe, 0x3, 0xe, 0x3, 0xf, 0x3, 0xf, 
    0x3, 0x10, 0x3, 0x10, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x2, 0x4, 0x16, 
    0x18, 0x12, 0x2, 0x4, 0x6, 0x8, 0xa, 0xc, 0xe, 0x10, 0x12, 0x14, 0x16, 
    0x18, 0x1a, 0x1c, 0x1e, 0x20, 0x2, 0x5, 0x3, 0x2, 0xf, 0x13, 0x3, 0x2, 
    0x14, 0x16, 0x3, 0x2, 0x17, 0x1c, 0x2, 0x9e, 0x2, 0x22, 0x3, 0x2, 0x2, 
    0x2, 0x4, 0x29, 0x3, 0x2, 0x2, 0x2, 0x6, 0x36, 0x3, 0x2, 0x2, 0x2, 0x8, 
    0x38, 0x3, 0x2, 0x2, 0x2, 0xa, 0x40, 0x3, 0x2, 0x2, 0x2, 0xc, 0x47, 
    0x3, 0x2, 0x2, 0x2, 0xe, 0x52, 0x3, 0x2, 0x2, 0x2, 0x10, 0x68, 0x3, 
    0x2, 0x2, 0x2, 0x12, 0x6d, 0x3, 0x2, 0x2, 0x2, 0x14, 0x6f, 0x3, 0x2, 
    0x2, 0x2, 0x16, 0x77, 0x3, 0x2, 0x2, 0x2, 0x18, 0x88, 0x3, 0x2, 0x2, 
    0x2, 0x1a, 0x97, 0x3, 0x2, 0x2, 0x2, 0x1c, 0x99, 0x3, 0x2, 0x2, 0x2, 
    0x1e, 0x9b, 0x3, 0x2, 0x2, 0x2, 0x20, 0x9d, 0x3, 0x2, 0x2, 0x2, 0x22, 
    0x23, 0x5, 0x4, 0x3, 0x2, 0x23, 0x24, 0x7, 0x2, 0x2, 0x3, 0x24, 0x3, 
    0x3, 0x2, 0x2, 0x2, 0x25, 0x2a, 0x5, 0x6, 0x4, 0x2, 0x26, 0x27, 0x5, 
    0x6, 0x4, 0x2, 0x27, 0x28, 0x5, 0x4, 0x3, 0x2, 0x28, 0x2a, 0x3, 0x2, 
    0x2, 0x2, 0x29, 0x25, 0x3, 0x2, 0x2, 0x2, 0x29, 0x26, 0x3, 0x2, 0x2, 
    0x2, 0x2a, 0x5, 0x3, 0x2, 0x2, 0x2, 0x2b, 0x2c, 0x5, 0xa, 0x6, 0x2, 
    0x2c, 0x2d, 0x7, 0x3, 0x2, 0x2, 0x2d, 0x37, 0x3, 0x2, 0x2, 0x2, 0x2e, 
    0x2f, 0x5, 0xc, 0x7, 0x2, 0x2f, 0x30, 0x7, 0x3, 0x2, 0x2, 0x30, 0x37, 
    0x3, 0x2, 0x2, 0x2, 0x31, 0x37, 0x5, 0x10, 0x9, 0x2, 0x32, 0x33, 0x5, 
    0xe, 0x8, 0x2, 0x33, 0x34, 0x7, 0x3, 0x2, 0x2, 0x34, 0x37, 0x3, 0x2, 
    0x2, 0x2, 0x35, 0x37, 0x5, 0x8, 0x5, 0x2, 0x36, 0x2b, 0x3, 0x2, 0x2, 
    0x2, 0x36, 0x2e, 0x3, 0x2, 0x2, 0x2, 0x36, 0x31, 0x3, 0x2, 0x2, 0x2, 
    0x36, 0x32, 0x3, 0x2, 0x2, 0x2, 0x36, 0x35, 0x3, 0x2, 0x2, 0x2, 0x37, 
    0x7, 0x3, 0x2, 0x2, 0x2, 0x38, 0x39, 0x7, 0x4, 0x2, 0x2, 0x39, 0x3a, 
    0x7, 0x5, 0x2, 0x2, 0x3a, 0x3b, 0x5, 0x18, 0xd, 0x2, 0x3b, 0x3c, 0x7, 
    0x6, 0x2, 0x2, 0x3c, 0x3d, 0x7, 0x7, 0x2, 0x2, 0x3d, 0x3e, 0x5, 0x4, 
    0x3, 0x2, 0x3e, 0x3f, 0x7, 0x8, 0x2, 0x2, 0x3f, 0x9, 0x3, 0x2, 0x2, 
    0x2, 0x40, 0x41, 0x7, 0x9, 0x2, 0x2, 0x41, 0x42, 0x7, 0x1d, 0x2, 0x2, 
    0x42, 0xb, 0x3, 0x2, 0x2, 0x2, 0x43, 0x44, 0x7, 0x1d, 0x2, 0x2, 0x44, 
    0x45, 0x7, 0xa, 0x2, 0x2, 0x45, 0x48, 0x5, 0x16, 0xc, 0x2, 0x46, 0x48, 
    0x5, 0x18, 0xd, 0x2, 0x47, 0x43, 0x3, 0x2, 0x2, 0x2, 0x47, 0x46, 0x3, 
    0x2, 0x2, 0x2, 0x48, 0xd, 0x3, 0x2, 0x2, 0x2, 0x49, 0x4a, 0x7, 0xb, 
    0x2, 0x2, 0x4a, 0x4b, 0x7, 0x5, 0x2, 0x2, 0x4b, 0x4c, 0x5, 0x12, 0xa, 
    0x2, 0x4c, 0x4d, 0x7, 0x6, 0x2, 0x2, 0x4d, 0x53, 0x3, 0x2, 0x2, 0x2, 
    0x4e, 0x4f, 0x7, 0xb, 0x2, 0x2, 0x4f, 0x50, 0x7, 0x5, 0x2, 0x2, 0x50, 
    0x51, 0x7, 0x1f, 0x2, 0x2, 0x51, 0x53, 0x7, 0x6, 0x2, 0x2, 0x52, 0x49, 
    0x3, 0x2, 0x2, 0x2, 0x52, 0x4e, 0x3, 0x2, 0x2, 0x2, 0x53, 0xf, 0x3, 
    0x2, 0x2, 0x2, 0x54, 0x55, 0x7, 0xc, 0x2, 0x2, 0x55, 0x56, 0x7, 0x5, 
    0x2, 0x2, 0x56, 0x57, 0x5, 0x18, 0xd, 0x2, 0x57, 0x58, 0x7, 0x6, 0x2, 
    0x2, 0x58, 0x59, 0x7, 0x7, 0x2, 0x2, 0x59, 0x5a, 0x5, 0x4, 0x3, 0x2, 
    0x5a, 0x5b, 0x7, 0x8, 0x2, 0x2, 0x5b, 0x69, 0x3, 0x2, 0x2, 0x2, 0x5c, 
    0x5d, 0x7, 0xc, 0x2, 0x2, 0x5d, 0x5e, 0x7, 0x5, 0x2, 0x2, 0x5e, 0x5f, 
    0x5, 0x18, 0xd, 0x2, 0x5f, 0x60, 0x7, 0x6, 0x2, 0x2, 0x60, 0x61, 0x7, 
    0x7, 0x2, 0x2, 0x61, 0x62, 0x5, 0x4, 0x3, 0x2, 0x62, 0x63, 0x7, 0x8, 
    0x2, 0x2, 0x63, 0x64, 0x7, 0xd, 0x2, 0x2, 0x64, 0x65, 0x7, 0x7, 0x2, 
    0x2, 0x65, 0x66, 0x5, 0x4, 0x3, 0x2, 0x66, 0x67, 0x7, 0x8, 0x2, 0x2, 
    0x67, 0x69, 0x3, 0x2, 0x2, 0x2, 0x68, 0x54, 0x3, 0x2, 0x2, 0x2, 0x68, 
    0x5c, 0x3, 0x2, 0x2, 0x2, 0x69, 0x11, 0x3, 0x2, 0x2, 0x2, 0x6a, 0x6e, 
    0x7, 0x1e, 0x2, 0x2, 0x6b, 0x6e, 0x7, 0x1d, 0x2, 0x2, 0x6c, 0x6e, 0x5, 
    0x1a, 0xe, 0x2, 0x6d, 0x6a, 0x3, 0x2, 0x2, 0x2, 0x6d, 0x6b, 0x3, 0x2, 
    0x2, 0x2, 0x6d, 0x6c, 0x3, 0x2, 0x2, 0x2, 0x6e, 0x13, 0x3, 0x2, 0x2, 
    0x2, 0x6f, 0x70, 0x7, 0xe, 0x2, 0x2, 0x70, 0x15, 0x3, 0x2, 0x2, 0x2, 
    0x71, 0x72, 0x8, 0xc, 0x1, 0x2, 0x72, 0x78, 0x5, 0x12, 0xa, 0x2, 0x73, 
    0x74, 0x7, 0x5, 0x2, 0x2, 0x74, 0x75, 0x5, 0x16, 0xc, 0x2, 0x75, 0x76, 
    0x7, 0x6, 0x2, 0x2, 0x76, 0x78, 0x3, 0x2, 0x2, 0x2, 0x77, 0x71, 0x3, 
    0x2, 0x2, 0x2, 0x77, 0x73, 0x3, 0x2, 0x2, 0x2, 0x78, 0x7f, 0x3, 0x2, 
    0x2, 0x2, 0x79, 0x7a, 0xc, 0x4, 0x2, 0x2, 0x7a, 0x7b, 0x5, 0x1c, 0xf, 
    0x2, 0x7b, 0x7c, 0x5, 0x16, 0xc, 0x5, 0x7c, 0x7e, 0x3, 0x2, 0x2, 0x2, 
    0x7d, 0x79, 0x3, 0x2, 0x2, 0x2, 0x7e, 0x81, 0x3, 0x2, 0x2, 0x2, 0x7f, 
    0x7d, 0x3, 0x2, 0x2, 0x2, 0x7f, 0x80, 0x3, 0x2, 0x2, 0x2, 0x80, 0x17, 
    0x3, 0x2, 0x2, 0x2, 0x81, 0x7f, 0x3, 0x2, 0x2, 0x2, 0x82, 0x83, 0x8, 
    0xd, 0x1, 0x2, 0x83, 0x89, 0x5, 0x16, 0xc, 0x2, 0x84, 0x85, 0x7, 0x5, 
    0x2, 0x2, 0x85, 0x86, 0x5, 0x18, 0xd, 0x2, 0x86, 0x87, 0x7, 0x6, 0x2, 
    0x2, 0x87, 0x89, 0x3, 0x2, 0x2, 0x2, 0x88, 0x82, 0x3, 0x2, 0x2, 0x2, 
    0x88, 0x84, 0x3, 0x2, 0x2, 0x2, 0x89, 0x94, 0x3, 0x2, 0x2, 0x2, 0x8a, 
    0x8b, 0xc, 0x5, 0x2, 0x2, 0x8b, 0x8c, 0x5, 0x1e, 0x10, 0x2, 0x8c, 0x8d, 
    0x5, 0x18, 0xd, 0x6, 0x8d, 0x93, 0x3, 0x2, 0x2, 0x2, 0x8e, 0x8f, 0xc, 
    0x4, 0x2, 0x2, 0x8f, 0x90, 0x5, 0x20, 0x11, 0x2, 0x90, 0x91, 0x5, 0x18, 
    0xd, 0x5, 0x91, 0x93, 0x3, 0x2, 0x2, 0x2, 0x92, 0x8a, 0x3, 0x2, 0x2, 
    0x2, 0x92, 0x8e, 0x3, 0x2, 0x2, 0x2, 0x93, 0x96, 0x3, 0x2, 0x2, 0x2, 
    0x94, 0x92, 0x3, 0x2, 0x2, 0x2, 0x94, 0x95, 0x3, 0x2, 0x2, 0x2, 0x95, 
    0x19, 0x3, 0x2, 0x2, 0x2, 0x96, 0x94, 0x3, 0x2, 0x2, 0x2, 0x97, 0x98, 
    0x5, 0x14, 0xb, 0x2, 0x98, 0x1b, 0x3, 0x2, 0x2, 0x2, 0x99, 0x9a, 0x9, 
    0x2, 0x2, 0x2, 0x9a, 0x1d, 0x3, 0x2, 0x2, 0x2, 0x9b, 0x9c, 0x9, 0x3, 
    0x2, 0x2, 0x9c, 0x1f, 0x3, 0x2, 0x2, 0x2, 0x9d, 0x9e, 0x9, 0x4, 0x2, 
    0x2, 0x9e, 0x21, 0x3, 0x2, 0x2, 0x2, 0xd, 0x29, 0x36, 0x47, 0x52, 0x68, 
    0x6d, 0x77, 0x7f, 0x88, 0x92, 0x94, 
  };

  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

tinycParser::Initializer tinycParser::_init;
