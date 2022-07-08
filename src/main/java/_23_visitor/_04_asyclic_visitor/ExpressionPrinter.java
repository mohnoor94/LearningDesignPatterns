package _23_visitor._04_asyclic_visitor;

// Implements certain visitors (or all, as you wish) - each will force you to implement a new `visit` as needed.
public class ExpressionPrinter implements IntExpressionVisitor, AdditionExpressionVisitor {
    private final StringBuilder stringBuilder;

    public ExpressionPrinter(StringBuilder stringBuilder) {
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
}
