package _06_bridge._01_basic_bridge;

public abstract class Shape {

    protected Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();

    public abstract void resize(float factor);
}
