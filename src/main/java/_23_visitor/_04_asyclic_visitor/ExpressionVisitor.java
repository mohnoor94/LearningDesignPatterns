package _23_visitor._04_asyclic_visitor;

interface ExpressionVisitor extends Visitor {
    void visit(Expression expression);
}
