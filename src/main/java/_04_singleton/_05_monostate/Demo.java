package _04_singleton._05_monostate;

public class Demo {

    public static void main(String[] args) {
        MonostateManager oldManager = new MonostateManager("Ali", 45);
        MonostateManager newManager = new MonostateManager("Rami", 35);

        // Both objects are actually one
        System.out.println(oldManager);
        System.out.println(newManager);
    }
}
