package _06_bridge._02_with_dependency_injection;

public class VectorRenderer implements Renderer {

    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle of radius: " + radius);
    }
}
