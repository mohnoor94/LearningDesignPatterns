package _14_interpreter._01_handmadInterpreter.parse;

public class BinaryOperation implements Element {

    public enum Type {
        ADDITION,
        SUBTRACTION;
    }

    private Type type;
    private Element left;
    private Element right;

    @Override
    public int eval() {
        switch (type) {
            case ADDITION:
                return left.eval() + right.eval();
            case SUBTRACTION:
                return left.eval() - right.eval();
            default:
                return 0;
        }
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Element getLeft() {
        return left;
    }

    public void setLeft(Element left) {
        this.left = left;
    }

    public Element getRight() {
        return right;
    }

    public void setRight(Element right) {
        this.right = right;
    }
}
