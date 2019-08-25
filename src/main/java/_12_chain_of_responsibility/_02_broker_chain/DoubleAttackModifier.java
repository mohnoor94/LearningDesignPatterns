package _12_chain_of_responsibility._02_broker_chain;

public class DoubleAttackModifier
        extends CreatureModifier
        implements AutoCloseable {

    private final int token;

    public DoubleAttackModifier(Game game, Creature creature) {
        super(game, creature);

        token = game.queries.subscribe(q -> {
            if (q.getCreatureName().equals(creature.getName())
                    && q.getArgument() == Query.Argument.ATTACK) {
                q.setResult(q.getResult() * 2);
            }
        });
    }


    @Override
    public void close() /*throws Exception*/ {
        game.queries.unsubscribe(token);
    }
}
