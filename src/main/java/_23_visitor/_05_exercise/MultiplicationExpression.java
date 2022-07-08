package _23_visitor._05_exercise;

public class MultiplicationExpression extends Expression {
    public Expression lhs, rhs;

    public MultiplicationExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    void accept(ExpressionVisitor ev) {
        ev.visit(this);
    }
}
