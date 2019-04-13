package _08_decorator._05_excercise_dragon;

public class Lizard {
    private int age;

    public String crawl() {
        return (age > 3) ? "crawling" : "too young";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
