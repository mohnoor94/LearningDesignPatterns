package _23_visitor._02_reflective_visitor;

public class ExpressionPrinter {

    public static void print(Expression expression, StringBuilder sb) {
        if (expression.getClass() == IntExpression.class) {
            sb.append(((IntExpression) expression).getValue());
        } else if (expression.getClass() == AdditionExpression.class) {
            sb.append("(");
            print(((AdditionExpression) expression).getLeft(), sb);
            sb.append(" + ");
            print(((AdditionExpression) expression).getRight(), sb);
            sb.append(")");
        } else {
            throw new IllegalArgumentException("Unknown expression type: " + expression.getClass());
        }
    }
}
