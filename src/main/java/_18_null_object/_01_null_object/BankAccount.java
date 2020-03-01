package _18_null_object._01_null_object;

public class BankAccount {
  private int balance;
  private Log log;

  public BankAccount(Log log) {
    this.log = log;
  }

  public void deposit(int amount) {
    balance += amount;

    // no need for null check
    log.info("Deposited: " + amount);
  }
}
