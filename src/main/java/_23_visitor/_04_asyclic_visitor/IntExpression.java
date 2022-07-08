package _23_visitor._04_asyclic_visitor;

public class IntExpression extends Expression {
    private int value;

    public IntExpression(int value) {
        this.value = value;
    }

    @Override
    public void accept(Visitor visitor) {
        if (visitor instanceof IntExpressionVisitor) {
            ((IntExpressionVisitor) visitor).visit(this);
        }
    }

    public int getValue() {
        return value;
    }
}
