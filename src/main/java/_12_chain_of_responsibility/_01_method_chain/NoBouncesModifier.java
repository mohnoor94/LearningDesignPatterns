package _12_chain_of_responsibility._01_method_chain;

// This will stop all next modifiers!
public class NoBouncesModifier extends CreatureModifier {

    public NoBouncesModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("No more bounces for you!");
        // do nothing!!
    }
}
