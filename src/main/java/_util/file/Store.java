package _util.file;

import java.io.*;

public class Store {

    public static <T> void save(T object, String fileName) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(object);
        }
    }

    public static <T> T read(Class<T> clazz, String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            return clazz.cast(in.readObject());
        }
    }
}
