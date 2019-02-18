package _02_factories._03_abstract_factory;

public class CoffeeFactory implements HotDrinkFactory {

    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Grind some beans, boil water, pour "
                + amount + "ml, add cream and sugar, enjoy!");
        return new Coffee(); // customize the coffee! That the whole idea of factories.
    }
}
