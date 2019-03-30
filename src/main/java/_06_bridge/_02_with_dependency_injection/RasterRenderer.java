package _06_bridge._02_with_dependency_injection;

public class RasterRenderer implements Renderer {

    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing pixels for a circle of radius: " + radius);
    }
}
