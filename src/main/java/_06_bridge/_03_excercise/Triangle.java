package _06_bridge._03_excercise;

class Triangle extends Shape {

    public Triangle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}
