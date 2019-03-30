package _06_bridge._03_excercise;

abstract class Shape {

    protected Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract String getName();

    @Override
    public String toString() {
        return String.format("Drawing %s as %s", getName(), renderer.whatToRenderAs());
    }
}
