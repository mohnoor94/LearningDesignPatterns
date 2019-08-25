package _12_chain_of_responsibility._02_broker_chain;

public class CreatureModifier {
    protected Game game;
    private Creature creature;

    public CreatureModifier(Game game, Creature creature) {
        this.game = game;
        this.creature = creature;
    }
}
