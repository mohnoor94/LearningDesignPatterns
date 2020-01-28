package _16_mediator._02_reactive_extinsions_event_broaker;

public class FootballPlayer {
  private String name;
  private int goalsScored;
  private EventBroker broker;

  public FootballPlayer(String name, EventBroker broker) {
    this.name = name;
    this.broker = broker;
  }

  public void score() {
    broker.publish(++goalsScored);
  }
}
