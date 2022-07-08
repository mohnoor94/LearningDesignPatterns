package _23_visitor._04_asyclic_visitor;

public abstract class Expression {
    public void accept(Visitor visitor) {
        // Conditional invocation of the `visit` method in the visitor.
        // You can ignore certain visitors if you want.
        if (visitor instanceof ExpressionVisitor) {
            ((ExpressionVisitor) visitor).visit(this);
        }
    }
}
