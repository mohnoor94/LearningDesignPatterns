package _06_bridge._01_basic_bridge;

public class Demo {

    public static void main(String[] args) {
        RasterRenderer raster = new RasterRenderer();
        VectorRenderer vector = new VectorRenderer();

        // Create the circle with any renderer you want
        Circle circle = new Circle(raster, 5);
        circle.draw();
        circle.resize(2);
        circle.draw();

        // This is not so great, you may have to use and write the renderer in many places in your code
        // and then you have to update all of them for any change

        // A better solution will be to use a Dependency Injection (DI) framework to inject the renderer you
        // want in all places, so you have a single point to update.
        // That's what we will do in next section in bridge design pattern (6.2).
    }
}
