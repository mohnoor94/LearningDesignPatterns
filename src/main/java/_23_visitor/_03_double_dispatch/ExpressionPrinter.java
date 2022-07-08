package _23_visitor._03_double_dispatch;

public class ExpressionPrinter implements ExpressionVisitor {
    private final StringBuilder stringBuilder;

    ExpressionPrinter(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void visit(IntExpression expression) {
        stringBuilder.append(expression.getValue());
    }

    @Override
    public void visit(AdditionExpression expression) {
        stringBuilder.append("(");
        expression.getLeft().accept(this);
        stringBuilder.append(" + ");
        expression.getRight().accept(this);
        stringBuilder.append(")");
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
