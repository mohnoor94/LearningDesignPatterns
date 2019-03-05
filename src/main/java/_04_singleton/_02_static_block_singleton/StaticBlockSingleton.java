package _04_singleton._02_static_block_singleton;

import java.io.File;
import java.io.IOException;

public class StaticBlockSingleton {

    private static StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton() throws IOException {
        System.out.println("Singleton is initializing");
        File tempFile = File.createTempFile(".", ".");
    }

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (IOException e) {
            System.err.println("Failed to create singleton!!!");
        }
    }

    public static StaticBlockSingleton getINSTANCE() {
        return INSTANCE;
    }
}
