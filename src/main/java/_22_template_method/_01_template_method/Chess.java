package _22_template_method._01_template_method;

public class Chess extends Game {
  private final int MAX_TURNS = 10;
  private int turn = 1;

  public Chess() {
    super(2);
  }

  @Override
  protected int getWinningPlayer() {
    return Math.abs((currentPlayer - 1) % numberOfPlayers); // dummy implementation
  }

  @Override
  protected void takeTurn() {
    System.out.printf("Turn %d taken by player %d\n", turn++, currentPlayer);
    currentPlayer = (currentPlayer + 1) % numberOfPlayers;
  }

  @Override
  protected boolean haveWinner() {
    return turn == MAX_TURNS;
  }

  @Override
  protected void start() {
    System.out.println("Starting a game of Chess!");
  }
}
