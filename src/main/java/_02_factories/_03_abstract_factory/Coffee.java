package _02_factories._03_abstract_factory;

public class Coffee implements HotDrink {

    @Override
    public void consume() {
        System.out.println("This coffee is delicious");
    }
}
