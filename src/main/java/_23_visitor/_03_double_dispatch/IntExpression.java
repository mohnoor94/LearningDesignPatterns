package _23_visitor._03_double_dispatch;

public class IntExpression extends Expression {
    private int value;

    public IntExpression(int value) {
        this.value = value;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }

    public int getValue() {
        return value;
    }
}
