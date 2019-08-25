package _12_chain_of_responsibility._02_broker_chain;

public class Demo {

    public static void main(String[] args) {
        Game game = new Game();
        Creature goblin = new Creature(game, "Strong Goblin", 2, 2);

        System.out.println(goblin);

        new IncreaseDefenseModifier(game, goblin);

        System.out.println(goblin);

        try (DoubleAttackModifier dam = new DoubleAttackModifier(game, goblin)) {
            System.out.println(goblin);
        } // this is a temporarily modifier now!

        System.out.println(goblin);
    }
}
