package _20_state._04_excercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CombinationLockTest {
  @Test
  public void testSuccess() {
    CombinationLock cl = new CombinationLock(new int[]{1, 2, 3, 4});
    assertEquals("LOCKED", cl.getStatus());

    cl.enterDigit(1);
    assertEquals("1", cl.getStatus());

    cl.enterDigit(2);
    assertEquals("12", cl.getStatus());

    cl.enterDigit(3);
    assertEquals("123", cl.getStatus());

    cl.enterDigit(4);
    assertEquals("OPEN", cl.getStatus());
  }

  @Test
  public void testFailure() {
    CombinationLock cl = new CombinationLock(new int[]{1, 2, 3});

    assertEquals("LOCKED", cl.getStatus());

    cl.enterDigit(1);
    assertEquals("1", cl.getStatus());

    cl.enterDigit(2);
    assertEquals("12", cl.getStatus());

    cl.enterDigit(5);
    assertEquals("ERROR", cl.getStatus());
  }
}