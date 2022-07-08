package _23_visitor._04_asyclic_visitor;

interface AdditionExpressionVisitor extends Visitor {
    void visit(AdditionExpression expression);
}
