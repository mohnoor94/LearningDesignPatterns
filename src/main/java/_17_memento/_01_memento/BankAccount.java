package _17_memento._01_memento;

public class BankAccount {
  private int balance;

  public BankAccount(int balance) {
    this.balance = balance;
  }

  public BankAccountToken deposit(int amount) {
    balance += amount;
    return new BankAccountToken(balance);
  }

  public void restore(BankAccountToken token) {
    balance = token.getBalance();
  }

  @Override
  public String toString() {
    return "BankAccount{" +
            "balance=" + balance +
            '}';
  }
}
