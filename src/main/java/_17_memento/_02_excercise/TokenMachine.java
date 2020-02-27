package _17_memento._02_excercise;

import java.util.ArrayList;
import java.util.List;

public class TokenMachine {
  public List<Token> tokens = new ArrayList<>();

  public Memento addToken(int value) {
    return addToken(new Token(value));
  }

  public Memento addToken(Token token) {
    tokens.add(token);
    return Memento.of(tokens);
  }

  public void revert(Memento memento) {
    tokens = memento.getTokens();
  }
}
