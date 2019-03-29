package _05_adapter._03_excercise_square_to_rectangle;

public class SquareToRectangleAdapter implements Rectangle {

    private Square square;

    public SquareToRectangleAdapter(Square square) {
        this.square = square;
    }

    @Override
    public int getWidth() {
        return square.getSide();
    }

    @Override
    public int getHeight() {
        return square.getSide();
    }
}
