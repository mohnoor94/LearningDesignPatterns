package _16_mediator._03_exercise;

public class Participant {
  private int value;
  private Mediator mediator;

  public Participant(Mediator mediator) {
    this.mediator = mediator;
    mediator.join(this);
  }

  public void say(int n) {
    mediator.broadcast(this, n);
  }

  public void increaseValue(int by) {
    this.value += by;
  }

  public int getValue() {
    return value;
  }
}
