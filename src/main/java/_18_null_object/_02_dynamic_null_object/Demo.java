package _18_null_object._02_dynamic_null_object;

import _18_null_object._01_null_object.BankAccount;
import _18_null_object._01_null_object.Log;

public class Demo {

  public static void main(String[] args) {
    final Log nullLog = NullObjectBuilder.build(Log.class);
    final BankAccount bankAccount = new BankAccount(nullLog);
    bankAccount.deposit(500);
  }
}
