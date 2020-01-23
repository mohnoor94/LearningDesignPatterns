package _14_interpreter._01_handmadInterpreter.parse;

import _14_interpreter._01_handmadInterpreter.lex.Token;

import java.util.List;
import java.util.stream.Collectors;

public class Parser {

    public static Element parse(List<Token> tokens) {
        final BinaryOperation result = new BinaryOperation();
        boolean haveLHS = false; // LHS = left hand side

        for (int i = 0; i < tokens.size(); i++) {
            final Token token = tokens.get(i);

            switch (token.getType()) {
                case INTEGER:
                    final IntegerElement integer = new IntegerElement(Integer.parseInt(token.getText()));
                    if (!haveLHS) {
                        result.setLeft(integer);
                        haveLHS = true;
                    } else result.setRight(integer);
                    break;
                case PLUS:
                    result.setType(BinaryOperation.Type.ADDITION);
                    break;
                case MINUS:
                    result.setType(BinaryOperation.Type.SUBTRACTION);
                    break;
                case LEFT_PAREN:
                    int j = i; // location of right paren - assuming there is no nesting!
                    for (; j < tokens.size(); j++) if (tokens.get(j).getType() == Token.Type.RIGHT_PAREN) break;

                    final List<Token> subExpression = tokens.stream()
                            .skip(i + 1)
                            .limit(j - i - 1)
                            .collect(Collectors.toList());

                    final Element element = parse(subExpression);

                    if (!haveLHS) {
                        result.setLeft(element);
                        haveLHS = true;
                    } else result.setRight(element);

                    i = j;
            }
        }

        return result;
    }
}
