package _22_template_method._01_template_method;

public abstract class Game {
  protected int numberOfPlayers;
  protected int currentPlayer;

  public Game(int numberOfPlayers) {
    this.numberOfPlayers = numberOfPlayers;
  }

  public void run() {
    start();
    while (!haveWinner()) takeTurn();

    System.out.printf("Player %s wins!\n", getWinningPlayer());
  }

  protected abstract int getWinningPlayer();
  protected abstract void takeTurn();
  protected abstract boolean haveWinner();
  protected abstract void start();
}
