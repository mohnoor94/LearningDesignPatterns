package _02_factories._03_abstract_factory;

public class Tea implements HotDrink {

    @Override
    public void consume() {
        System.out.println("This tea is delicious");
    }
}
