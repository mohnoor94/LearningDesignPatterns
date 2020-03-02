package _19_observer._03_excercise;

// Imagine a game where one or more rats can attack a player. Each individual rat has an `attack` value of 1. However,
// rats attack as a swarm, so each rat's `attack` value is equal to the total number of rats in play.

// Given that a rat enters play through the constructor and leaves play (dies) via its `close()` method, please
// implement the Game and Rat classes so that, at any point in the game, the `attack` value of a rat is always
// consistent.

// Initial Code:

/*
import java.io.Closeable;
import java.io.IOException;

class Game
{
    // ...
}

class Rat implements Closeable
{
  private Game game;
  public int attack = 1;

  public Rat(Game game)
  {
    // ...
  }

  @Override
  public void close() throws IOException
  {
    // ...
  }
}
 */