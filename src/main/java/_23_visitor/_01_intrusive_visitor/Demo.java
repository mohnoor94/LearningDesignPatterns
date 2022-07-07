package _23_visitor._01_intrusive_visitor;

public class Demo {

    public static void main(String[] args) {
        final Expression e = new AdditionExpression(
                new IntExpression(3),
                new AdditionExpression(
                        new IntExpression(5),
                        new IntExpression(8)
                )
        );

        final StringBuilder sb = new StringBuilder();
        e.print(sb);
        System.out.println(sb);
    }
}
