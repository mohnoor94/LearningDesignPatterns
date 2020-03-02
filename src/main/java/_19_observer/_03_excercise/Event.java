package _19_observer._03_excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class Event<T> {
  private List<BiConsumer<Object, T>> consumers = new ArrayList<>();

  public void subscribe(BiConsumer<Object, T> consumer) {
    consumers.add(consumer);
  }

  public void invoke(Object sender, T arg) {
    consumers.forEach(consumer -> consumer.accept(sender, arg));
  }
}