package _23_visitor._05_exercise;

public class AdditionExpression extends Expression {
    public Expression lhs, rhs;

    public AdditionExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    void accept(ExpressionVisitor ev) {
        ev.visit(this);
    }
}