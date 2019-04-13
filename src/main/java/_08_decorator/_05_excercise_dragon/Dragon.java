package _08_decorator._05_excercise_dragon;

public class Dragon {
    private int age;
    private Bird bird = new Bird();
    private Lizard lizard = new Lizard();

    public void setAge(int age) {
        this.age = age;
        bird.setAge(age);
        lizard.setAge(age);
    }

    public String fly() {
        return bird.fly();
    }

    public String crawl() {
        return lizard.crawl();
    }
}