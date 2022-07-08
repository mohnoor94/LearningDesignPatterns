package _23_visitor._05_exercise;

abstract class Expression {
    abstract void accept(ExpressionVisitor ev);
}