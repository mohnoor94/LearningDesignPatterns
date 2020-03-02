package _19_observer._02_event;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Event<TArgs> {
  private int count = 0;
  private Map<Integer, Consumer<TArgs>> handlers = new HashMap<>();

  // Memento
  public Subscription<TArgs> addHandler(Consumer<TArgs> handler) {
    int i = count;
    handlers.put(count++, handler);
    return new Subscription<>(this, i);
  }

  // fire actions when the event happened
  public void fire(TArgs args) {
    handlers.values().forEach(handler -> handler.accept(args));
  }

  public Map<Integer, Consumer<TArgs>> getHandlers() {
    return handlers;
  }
}
