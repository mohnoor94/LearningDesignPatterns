package _02_factories._03_abstract_factory;

public class TeaFactory implements HotDrinkFactory {

    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Put in tea bag, boil water, pour "
                + amount + "ml, add lemon, enjoy!");
        return new Tea(); // customize the tea! That the whole idea of factories.
    }
}
