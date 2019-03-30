package _06_bridge._01_basic_bridge;

public class VectorRenderer implements Renderer {

    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle of radius: " + radius);
    }
}
