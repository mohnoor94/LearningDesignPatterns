package _12_chain_of_responsibility._03_excercise;

public class Test {

    public static void main(String[] args) {
        final Game game = new Game();
        final Goblin goblin = new Goblin(game);
        game.creatures.add(goblin);

        System.out.println(goblin.getAttack()); // 1
        System.out.println(goblin.getDefense()); // 1

        Goblin goblin2 = new Goblin(game);
        game.creatures.add(goblin2);

        System.out.println(goblin.getAttack()); // 1
        System.out.println(goblin.getDefense()); // 2

        GoblinKing goblin3 = new GoblinKing(game);
        game.creatures.add(goblin3);

        System.out.println(goblin.getAttack()); // 2
        System.out.println(goblin.getDefense()); // 3
    }
}
