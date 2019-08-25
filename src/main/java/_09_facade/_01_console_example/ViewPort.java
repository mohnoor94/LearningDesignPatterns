package _09_facade._01_console_example;

// higher construct
public class ViewPort {
    private Buffer buffer;
    private int wifth;
    private int height;
    private int offsetX;
    private int offsetY;


    public ViewPort(Buffer buffer, int wifth, int height, int offsetX, int offsetY) {
        this.buffer = buffer;
        this.wifth = wifth;
        this.height = height;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
    }

    public char charAt(int x, int y) {
        return buffer.charAt(x + offsetX, y + offsetY);
    }
}
