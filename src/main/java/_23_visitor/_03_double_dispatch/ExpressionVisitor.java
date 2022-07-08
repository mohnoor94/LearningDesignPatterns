package _23_visitor._03_double_dispatch;

// All visitors have to implement this interface.
// We are sure that we will have a `visit` method for every expression.
public interface ExpressionVisitor {
    void visit(IntExpression expression);

    void visit(AdditionExpression expression);
}
