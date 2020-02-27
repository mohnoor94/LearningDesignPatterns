package _17_memento._02_excercise;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TokenMachineTest {

  @Test
  public void singleTokenTest() {
    TokenMachine machine = new TokenMachine();
    Memento memento = machine.addToken(123);
    machine.addToken(456);
    machine.revert(memento);

    assertEquals(1, machine.tokens.size());
    assertEquals(123, machine.tokens.get(0).getValue());
  }

  @Test
  public void twoTokenTest() {
    TokenMachine machine = new TokenMachine();
    machine.addToken(1);
    Memento memento = machine.addToken(2);
    machine.addToken(3);
    machine.revert(memento);
    assertEquals(2, machine.tokens.size());
    assertEquals("First token should have value 1",
            1, machine.tokens.get(0).getValue());
    assertEquals(2, machine.tokens.get(1).getValue());
  }

  @Test
  public void fiddledTokenTest() {
    TokenMachine machine = new TokenMachine();
    System.out.println("Made a token with value 111 and kept a reference");
    Token token = new Token(111);
    System.out.println("Added this token to the list");
    machine.addToken(token);
    Memento memento = machine.addToken(222);
    System.out.println("Changed this token's value to 333 :)");
    token.setValue(333);
    machine.revert(memento);

    assertEquals(
            "At this point, token machine should have exactly two tokens, but you got " + machine.tokens.size(),
            2, machine.tokens.size()
    );

    assertEquals("You got the token value wrong here. Hint: did you init the memento by value?",
            111, machine.tokens.get(0).getValue());
  }
}
