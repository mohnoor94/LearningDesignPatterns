package _14_interpreter._01_handmadInterpreter;

import _14_interpreter._01_handmadInterpreter.lex.Lexer;
import _14_interpreter._01_handmadInterpreter.lex.Token;
import _14_interpreter._01_handmadInterpreter.parse.Element;
import _14_interpreter._01_handmadInterpreter.parse.Parser;

import java.util.List;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        final String input = "(13+4)-(12+1)";
        final List<Token> tokens = Lexer.lex(input);

        System.out.println(tokens.stream()
                .map(Token::toString)
                .collect(Collectors.joining("\t"))
        );

        final Element parsed = Parser.parse(tokens);
        System.out.println(input + " = " + parsed.eval()); // WOW!
    }
}
