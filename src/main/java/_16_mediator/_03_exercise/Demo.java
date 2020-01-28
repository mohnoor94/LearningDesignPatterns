package _16_mediator._03_exercise;

public class Demo {

  public static void main(String[] args) {
    final Mediator mediator = new Mediator();
    final Participant first = new Participant(mediator);
    final Participant second = new Participant(mediator);
    final Participant third = new Participant(mediator);

    printValues(first, second, third);
    first.say(3);
    printValues(first, second, third);
    second.say(2);
    printValues(first, second, third);
    third.say(5);
    printValues(first, second, third);
  }

  private static void printValues(Participant first, Participant second, Participant third) {
    System.out.println("First: " + first.getValue());
    System.out.println("Second: " + second.getValue());
    System.out.println("Third: " + third.getValue());
    System.out.println("=============");
  }
}
