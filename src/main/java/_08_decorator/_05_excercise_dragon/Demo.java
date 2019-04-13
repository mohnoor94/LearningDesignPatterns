package _08_decorator._05_excercise_dragon;

public class Demo {

    public static void main(String[] args) {
        Dragon dragon1 = new Dragon();
        dragon1.setAge(5);
        System.out.println(dragon1.fly());
        System.out.println(dragon1.crawl());

        System.out.println("*".repeat(25));

        Dragon dragon2 = new Dragon();
        dragon2.setAge(15);
        System.out.println(dragon2.fly());
        System.out.println(dragon2.crawl());
        System.out.println("*".repeat(25));

        Dragon dragon3 = new Dragon();
        System.out.println(dragon3.fly());
        System.out.println(dragon3.crawl());
        System.out.println("*".repeat(25));
    }
}
