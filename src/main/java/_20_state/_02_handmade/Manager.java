package _20_state._02_handmade;

import org.javatuples.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager {
  private Manager() {
  }

  private static Map<State, List<Pair<Trigger, State>>> rules = new HashMap<>();
  public static State currentState = State.OFF_HOOK;
  public final static State EXIT_STATE = State.ON_HOOK;

  static {
    rules.put(State.OFF_HOOK, List.of(
            new Pair<>(Trigger.CALL_DIALED, State.CONNECTED),
            new Pair<>(Trigger.STOP_USING_PHONE, State.ON_HOOK)
    ));

    rules.put(State.CONNECTING, List.of(
            new Pair<>(Trigger.HUNG_UP, State.OFF_HOOK),
            new Pair<>(Trigger.CALL_CONNECTED, State.CONNECTED)
    ));

    rules.put(State.CONNECTED, List.of(
            new Pair<>(Trigger.LEFT_MESSAGE, State.OFF_HOOK),
            new Pair<>(Trigger.HUNG_UP, State.OFF_HOOK),
            new Pair<>(Trigger.PLACED_ON_HOLD, State.ON_HOLD)
    ));

    rules.put(State.ON_HOLD, List.of(
            new Pair<>(Trigger.TAKEN_OFF_HOLD, State.CONNECTED),
            new Pair<>(Trigger.HUNG_UP, State.OFF_HOOK)
    ));
  }

  public static List<Pair<Trigger, State>> getAvailableTransitions() {
    return getAvailableTransitions(currentState);
  }

  public static List<Pair<Trigger, State>> getAvailableTransitions(State state) {
    return rules.get(state);
  }
}
