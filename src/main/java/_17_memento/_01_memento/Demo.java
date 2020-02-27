package _17_memento._01_memento;

public class Demo {

  public static void main(String[] args) {
    final BankAccount bankAccount = new BankAccount(100);
    final BankAccountToken memento1 = bankAccount.deposit(50);
    final BankAccountToken memento2 = bankAccount.deposit(25);

    System.out.println(bankAccount);

    // restore to memento1
    bankAccount.restore(memento1);
    System.out.println(bankAccount);

    // restore to memento2
    bankAccount.restore(memento2);
    System.out.println(bankAccount);
  }
}
