package _05_adapter._03_excercise_square_to_rectangle;

public interface Rectangle {
    int getWidth();

    int getHeight();

    default int getArea() {
        return getWidth() * getHeight();
    }
}
