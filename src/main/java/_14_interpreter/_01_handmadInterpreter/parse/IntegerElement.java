package _14_interpreter._01_handmadInterpreter.parse;

public class IntegerElement implements Element {
    private int value;

    public IntegerElement(int value) {
        this.value = value;
    }

    @Override
    public int eval() {
        return value;
    }
}
