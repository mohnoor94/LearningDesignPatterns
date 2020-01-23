package _14_interpreter._01_handmadInterpreter.lex;

import java.util.ArrayList;
import java.util.List;

public class Lexer {

    public static List<Token> lex(String input) {
        final List<Token> result = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case '+':
                    result.add(new Token(Token.Type.PLUS, "+"));
                    break;
                case '-':
                    result.add(new Token(Token.Type.MINUS, "-"));
                    break;
                case '(':
                    result.add(new Token(Token.Type.LEFT_PAREN, "("));
                    break;
                case ')':
                    result.add(new Token(Token.Type.RIGHT_PAREN, ")"));
                    break;
                default: // integers - can be multiple digits
                    final var builder = new StringBuilder("" + input.charAt(i));

                    for (int j = i + 1; j < input.length(); j++) {
                        final char ch = input.charAt(j);
                        if (Character.isDigit(ch)) {
                            builder.append(ch);
                            i++;
                        } else {
                            result.add(new Token(Token.Type.INTEGER, builder.toString()));
                            break;
                        }
                    }
            }
        }

        return result;
    }
}
