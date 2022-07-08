package _23_visitor._04_asyclic_visitor;

interface IntExpressionVisitor extends Visitor {
    void visit(IntExpression expression);
}
