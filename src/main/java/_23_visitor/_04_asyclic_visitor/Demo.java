package _23_visitor._04_asyclic_visitor;

public class Demo {

    public static void main(String[] args) {
        final AdditionExpression e = new AdditionExpression(
                new IntExpression(3),
                new AdditionExpression(
                        new IntExpression(5),
                        new IntExpression(8)
                )
        );

        final StringBuilder sb = new StringBuilder();

        final ExpressionPrinter printer = new ExpressionPrinter(sb);
        printer.visit(e);
        System.out.println(sb);
    }
}
