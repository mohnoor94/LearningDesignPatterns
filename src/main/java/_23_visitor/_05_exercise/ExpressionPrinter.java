package _23_visitor._05_exercise;

public class ExpressionPrinter extends ExpressionVisitor {
    private StringBuilder sb = new StringBuilder();

    @Override
    void visit(Value value) {
        sb.append(value.value);
    }

    @Override
    void visit(AdditionExpression ae) {
        sb.append("(");
        ae.lhs.accept(this);
        sb.append(" + ");
        ae.rhs.accept(this);
        sb.append(")");
    }

    @Override
    void visit(MultiplicationExpression me) {
        me.lhs.accept(this);
        sb.append(" * ");
        me.rhs.accept(this);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}