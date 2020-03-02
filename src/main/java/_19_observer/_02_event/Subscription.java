package _19_observer._02_event;

// AutoClosable to be able to use Try with resources for auto unsubscription!
// Memento of Event
public class Subscription<TArgs> implements AutoCloseable {
  private Event<TArgs> event;
  private int id;

  public Subscription(Event<TArgs> event, int id) {
    this.event = event;
    this.id = id;
  }

  // unsubscribe!!
  @Override
  public void close() {
    event.getHandlers().remove(id);
  }
}
