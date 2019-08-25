package _12_chain_of_responsibility._02_broker_chain;

public class IncreaseDefenseModifier extends CreatureModifier {

    public IncreaseDefenseModifier(Game game, Creature creature) {
        super(game, creature);

        game.queries.subscribe(q -> {
            if (q.getCreatureName().equals(creature.getName())
                    && q.getArgument() == Query.Argument.DEFENSE) {
                q.setResult(q.getResult() + 3);
            }
        });
    }
}
