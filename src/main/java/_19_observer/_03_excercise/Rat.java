package _19_observer._03_excercise;

import java.io.Closeable;

public class Rat implements Closeable {
  private Game game;
  public int attack = 1;

  public Rat(Game game) {
    this.game = game;

    game.ratEnters.subscribe((sender, arg) -> {
      if (sender != this) {
        ++attack;
        game.notifyRat.invoke(this, (Rat) sender);
      }
    });

    game.notifyRat.subscribe((sender, rat) -> {
      if (rat == this) ++attack;
    });

    game.ratDies.subscribe((sender, arg) -> --attack);

    game.ratEnters.invoke(this, null);
  }

  @Override
  public void close() {
    game.ratDies.invoke(this, null);
  }
}