package _23_visitor._05_exercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {
    @Test
    public void simpleAddition() {
        AdditionExpression simple = new AdditionExpression(new Value(2), new Value(3));
        ExpressionPrinter ep = new ExpressionPrinter();
        ep.visit(simple);
        assertEquals("(2 + 3)", ep.toString());
    }

    @Test
    public void productOfAdditionAndValue() {
        MultiplicationExpression expr = new MultiplicationExpression(
                new AdditionExpression(new Value(2), new Value(3)),
                new Value(4)
        );
        ExpressionPrinter ep = new ExpressionPrinter();
        ep.visit(expr);
        assertEquals("(2 + 3) * 4", ep.toString());
    }
}








