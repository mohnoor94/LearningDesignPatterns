package _19_observer._03_excercise;

public class Game {
  public Event<Void> ratEnters = new Event<>();
  public Event<Void> ratDies = new Event<>();
  public Event<Rat> notifyRat = new Event<>();
}

