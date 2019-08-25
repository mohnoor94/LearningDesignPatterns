package _12_chain_of_responsibility._01_method_chain;

public class CreatureModifier {
    protected Creature creature;
    protected CreatureModifier next;

    public CreatureModifier(Creature creature) {
        this.creature = creature;
    }

    public void add(CreatureModifier creatureModifier) {
        if (next == null) next = creatureModifier;
        else next.add(creatureModifier);
    }

    // provide actual functionality on inherited `handle` methods!
    // this is only designed to traverse the entire chain of responsibility!
    public void handle() {
        if (next != null) next.handle();
    }
}
