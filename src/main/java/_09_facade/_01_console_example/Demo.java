package _09_facade._01_console_example;

public class Demo {

    public static void main(String[] args) {
        Buffer buffer = new Buffer(30, 20);
        ViewPort viewPort = new ViewPort(buffer, 30, 20, 0, 0);
        Console console1 = new Console(30, 20);
        console1.addViewport(viewPort);
        console1.render();

        // Or, using façade/factory:
        Console console2 = Console.newBasicConsole(20, 30);
        console2.render();
    }
}
