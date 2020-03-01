package _18_null_object._01_null_object;

public class Demo {

  public static void main(String[] args) {
    final ConsoleLog consoleLog = new ConsoleLog();
    final BankAccount ba1 = new BankAccount(consoleLog);
    ba1.deposit(500);

    final BankAccount ba2 = new BankAccount(new NullLog());
    ba2.deposit(500);
  }
}
