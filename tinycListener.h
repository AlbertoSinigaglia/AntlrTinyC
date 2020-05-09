
// Generated from tinyc.g4 by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"
#include "tinycParser.h"


/**
 * This interface defines an abstract listener for a parse tree produced by tinycParser.
 */
class  tinycListener : public antlr4::tree::ParseTreeListener {
public:

  virtual void enterStart(tinycParser::StartContext *ctx) = 0;
  virtual void exitStart(tinycParser::StartContext *ctx) = 0;

  virtual void enterProgram(tinycParser::ProgramContext *ctx) = 0;
  virtual void exitProgram(tinycParser::ProgramContext *ctx) = 0;

  virtual void enterStatement(tinycParser::StatementContext *ctx) = 0;
  virtual void exitStatement(tinycParser::StatementContext *ctx) = 0;

  virtual void enterLoop(tinycParser::LoopContext *ctx) = 0;
  virtual void exitLoop(tinycParser::LoopContext *ctx) = 0;

  virtual void enterDecl(tinycParser::DeclContext *ctx) = 0;
  virtual void exitDecl(tinycParser::DeclContext *ctx) = 0;

  virtual void enterAssign(tinycParser::AssignContext *ctx) = 0;
  virtual void exitAssign(tinycParser::AssignContext *ctx) = 0;

  virtual void enterOut(tinycParser::OutContext *ctx) = 0;
  virtual void exitOut(tinycParser::OutContext *ctx) = 0;

  virtual void enterBranch(tinycParser::BranchContext *ctx) = 0;
  virtual void exitBranch(tinycParser::BranchContext *ctx) = 0;

  virtual void enterExpr(tinycParser::ExprContext *ctx) = 0;
  virtual void exitExpr(tinycParser::ExprContext *ctx) = 0;

  virtual void enterRead(tinycParser::ReadContext *ctx) = 0;
  virtual void exitRead(tinycParser::ReadContext *ctx) = 0;

  virtual void enterArith(tinycParser::ArithContext *ctx) = 0;
  virtual void exitArith(tinycParser::ArithContext *ctx) = 0;

  virtual void enterArith_expr(tinycParser::Arith_exprContext *ctx) = 0;
  virtual void exitArith_expr(tinycParser::Arith_exprContext *ctx) = 0;

  virtual void enterRelation(tinycParser::RelationContext *ctx) = 0;
  virtual void exitRelation(tinycParser::RelationContext *ctx) = 0;

  virtual void enterInput(tinycParser::InputContext *ctx) = 0;
  virtual void exitInput(tinycParser::InputContext *ctx) = 0;

  virtual void enterArithmetic_operator(tinycParser::Arithmetic_operatorContext *ctx) = 0;
  virtual void exitArithmetic_operator(tinycParser::Arithmetic_operatorContext *ctx) = 0;

  virtual void enterLogic_operator(tinycParser::Logic_operatorContext *ctx) = 0;
  virtual void exitLogic_operator(tinycParser::Logic_operatorContext *ctx) = 0;

  virtual void enterComparison_operator(tinycParser::Comparison_operatorContext *ctx) = 0;
  virtual void exitComparison_operator(tinycParser::Comparison_operatorContext *ctx) = 0;


};

