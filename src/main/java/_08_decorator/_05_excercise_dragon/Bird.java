package _08_decorator._05_excercise_dragon;

public class Bird {
    private int age;

    public String fly() {
        return age < 10 ? "flying" : "too old";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}