package _23_visitor._03_double_dispatch;

public abstract class Expression {
    public abstract void accept(ExpressionVisitor visitor);
}
