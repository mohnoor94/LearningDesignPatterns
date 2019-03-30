package _06_bridge._03_excercise;

class Square extends Shape {

    public Square(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String getName() {
        return "Square";
    }
}
