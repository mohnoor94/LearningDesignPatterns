package _12_chain_of_responsibility._02_broker_chain;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

// CQS
// Observer Pattern
public class Event<Args> {
    private int index = 0;
    private Map<Integer, Consumer<Args>> handlers = new HashMap<>();

    public int subscribe(Consumer<Args> handler) {
        int i = this.index;
        handlers.put(index++, handler);
        return i;
    }

    public void unsubscribe(int key) {
        handlers.remove(key);
    }

    public void fire(Args args) {
        handlers.values().forEach(h -> h.accept(args));
    }
}
