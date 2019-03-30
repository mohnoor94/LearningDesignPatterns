package _06_bridge._01_basic_bridge;

public class RasterRenderer implements Renderer {

    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing pixels for a circle of radius: " + radius);
    }
}
