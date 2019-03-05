package _04_singleton._05_monostate;

public class MonostateManager {

    private static String name;
    private static int age;

    public MonostateManager(String name, int age) {
        MonostateManager.name = name;
        MonostateManager.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        MonostateManager.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        MonostateManager.age = age;
    }

    @Override
    public String toString() {
        return "MonostateManager{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
