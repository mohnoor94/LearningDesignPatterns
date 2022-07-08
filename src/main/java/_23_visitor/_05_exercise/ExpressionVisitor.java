package _23_visitor._05_exercise;

abstract class ExpressionVisitor {
    abstract void visit(Value value);

    abstract void visit(AdditionExpression ae);

    abstract void visit(MultiplicationExpression me);
}