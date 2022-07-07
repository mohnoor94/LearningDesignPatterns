package _23_visitor._02_reflective_visitor;


public class IntExpression extends Expression {
    private int value;

    public IntExpression(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
