package _23_visitor._03_double_dispatch;

public class ExpressionEvaluator implements ExpressionVisitor {
    private int result;
    @Override
    public void visit(IntExpression expression) {
        result = expression.getValue();
    }

    @Override
    public void visit(AdditionExpression expression) {
        expression.getLeft().accept(this);
        int left = result;
        expression.getRight().accept(this);
        int right = result;
        result = left + right;
    }

    public int getResult() {
        return result;
    }
}
