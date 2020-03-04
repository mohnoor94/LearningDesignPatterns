package _20_state._04_excercise;

public class CombinationLock {
  private static final String ERROR = "ERROR";
  private static final String LOCKED = "LOCKED";
  private static final String OPEN = "OPEN";

  private int[] combination;
  private String status;
  private int digitsEntered = 0;
  private boolean failed = false;

  public CombinationLock(int[] combination) {
    this.combination = combination;
    reset();
  }

  private void reset() {
    status = LOCKED;
    digitsEntered = 0;
    failed = false;
  }

  public void enterDigit(int digit) {
    if (status.equals(LOCKED)) status = "";
    status += digit;

    if (combination[digitsEntered] != digit) failed = true;
    digitsEntered++;

    if (digitsEntered == combination.length) status = failed ? ERROR : OPEN;
  }

  public String getStatus() {
    return status;
  }
}