package _16_mediator._02_reactive_extinsions_event_broaker;

public class FootballCoach {

  FootballCoach(EventBroker broker) {
    broker.subscribe(i -> System.out.println("Hey, you scored " + i + " goals!"));
  }
}
