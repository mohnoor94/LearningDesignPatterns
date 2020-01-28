package _16_mediator._02_reactive_extinsions_event_broaker;

public class Demo {

  public static void main(String[] args) {
    final EventBroker broker = new EventBroker();
    final FootballPlayer player = new FootballPlayer("Ali", broker);
    final FootballCoach coach = new FootballCoach(broker); // used to subscribe to the broker!

    player.score();
    player.score();
    System.out.println("BREAK");
    player.score();
  }
}
