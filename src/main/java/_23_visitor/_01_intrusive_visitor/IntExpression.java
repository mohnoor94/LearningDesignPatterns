package _23_visitor._01_intrusive_visitor;

public class IntExpression extends Expression {
    private int value;

    public IntExpression(int value) {
        this.value = value;
    }

    @Override
    void print(StringBuilder sb) {
        sb.append(value);
    }
}
