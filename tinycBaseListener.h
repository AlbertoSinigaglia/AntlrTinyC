
// Generated from tinyc.g4 by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"
#include "tinycListener.h"


/**
 * This class provides an empty implementation of tinycListener,
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
class  tinycBaseListener : public tinycListener {
public:

  virtual void enterStart(tinycParser::StartContext * /*ctx*/) override { }
  virtual void exitStart(tinycParser::StartContext * /*ctx*/) override { }

  virtual void enterProgram(tinycParser::ProgramContext * /*ctx*/) override { }
  virtual void exitProgram(tinycParser::ProgramContext * /*ctx*/) override { }

  virtual void enterStatement(tinycParser::StatementContext * /*ctx*/) override { }
  virtual void exitStatement(tinycParser::StatementContext * /*ctx*/) override { }

  virtual void enterLoop(tinycParser::LoopContext * /*ctx*/) override { }
  virtual void exitLoop(tinycParser::LoopContext * /*ctx*/) override { }

  virtual void enterDecl(tinycParser::DeclContext * /*ctx*/) override { }
  virtual void exitDecl(tinycParser::DeclContext * /*ctx*/) override { }

  virtual void enterAssign(tinycParser::AssignContext * /*ctx*/) override { }
  virtual void exitAssign(tinycParser::AssignContext * /*ctx*/) override { }

  virtual void enterOut(tinycParser::OutContext * /*ctx*/) override { }
  virtual void exitOut(tinycParser::OutContext * /*ctx*/) override { }

  virtual void enterBranch(tinycParser::BranchContext * /*ctx*/) override { }
  virtual void exitBranch(tinycParser::BranchContext * /*ctx*/) override { }

  virtual void enterExpr(tinycParser::ExprContext * /*ctx*/) override { }
  virtual void exitExpr(tinycParser::ExprContext * /*ctx*/) override { }

  virtual void enterRead(tinycParser::ReadContext * /*ctx*/) override { }
  virtual void exitRead(tinycParser::ReadContext * /*ctx*/) override { }

  virtual void enterArith(tinycParser::ArithContext * /*ctx*/) override { }
  virtual void exitArith(tinycParser::ArithContext * /*ctx*/) override { }

  virtual void enterRelation(tinycParser::RelationContext * /*ctx*/) override { }
  virtual void exitRelation(tinycParser::RelationContext * /*ctx*/) override { }

  virtual void enterInput(tinycParser::InputContext * /*ctx*/) override { }
  virtual void exitInput(tinycParser::InputContext * /*ctx*/) override { }

  virtual void enterArithmetic_operator(tinycParser::Arithmetic_operatorContext * /*ctx*/) override { }
  virtual void exitArithmetic_operator(tinycParser::Arithmetic_operatorContext * /*ctx*/) override { }

  virtual void enterLogic_operator(tinycParser::Logic_operatorContext * /*ctx*/) override { }
  virtual void exitLogic_operator(tinycParser::Logic_operatorContext * /*ctx*/) override { }

  virtual void enterComparison_operator(tinycParser::Comparison_operatorContext * /*ctx*/) override { }
  virtual void exitComparison_operator(tinycParser::Comparison_operatorContext * /*ctx*/) override { }


  virtual void enterEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void exitEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void visitTerminal(antlr4::tree::TerminalNode * /*node*/) override { }
  virtual void visitErrorNode(antlr4::tree::ErrorNode * /*node*/) override { }

};

