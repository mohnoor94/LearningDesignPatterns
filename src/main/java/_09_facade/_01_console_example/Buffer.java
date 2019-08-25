package _09_facade._01_console_example;

// low level construct
public class Buffer {
    private char[] chars;
    private int lineWidth;

    public Buffer(int lineWidth, int lineHeight) {
        this.lineWidth = lineWidth;
        chars = new char[lineHeight * lineWidth];
    }

    public char charAt(int x, int y) {
        return chars[y * lineWidth + x];
    }
}
