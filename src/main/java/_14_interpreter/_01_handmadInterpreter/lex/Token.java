package _14_interpreter._01_handmadInterpreter.lex;

public class Token {

    public enum Type {
        INTEGER,
        PLUS,
        MINUS,
        LEFT_PAREN, // (
        RIGHT_PAREN; // )
    }

    private Type type;
    private String text;

    public Token(Type type, String text) {
        this.type = type;
        this.text = text;
    }

    @Override
    public String toString() {
        return "`" + text + "`";
    }

    public Type getType() {
        return type;
    }

    public String getText() {
        return text;
    }
}
