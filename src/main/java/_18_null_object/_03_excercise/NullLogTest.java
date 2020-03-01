package _18_null_object._03_excercise;

import org.junit.Test;

public class NullLogTest {

  @Test
  public void singleCallTest() throws Exception {
    Account a = new Account(new NullLog());
    a.someOperation();
  }

  @Test
  public void manyCallsTest() throws Exception {
    Account a = new Account(new NullLog());
    for (int i = 0; i < 100; ++i) a.someOperation();
  }
}
