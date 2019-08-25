package _09_facade._01_console_example;

import java.util.ArrayList;
import java.util.List;

// highest construct
public class Console {
    private List<ViewPort> viewPorts = new ArrayList<>();
    private int width;
    private int height;

    public Console(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addViewport(ViewPort viewPort) {
        viewPorts.add(viewPort);
    }

    // console system pseudo code
    public void render() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                for (ViewPort port : viewPorts) {
                    System.out.print(port.charAt(x, y));
                }
                System.out.println();
            }
        }
    }

    // with façade, we should offer a high-level API to easily access low level components/constructs.
    // here we do this via a factory method
    public static Console newBasicConsole(int width, int height) {
        Buffer buffer = new Buffer(width, height);
        ViewPort viewPort = new ViewPort(buffer, width, height, 0, 0);
        Console console = new Console(width, height);
        console.addViewport(viewPort);
        return console;
    }
}
