package _17_memento._02_excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Memento {
  private List<Token> tokens;

  private Memento(List<Token> tokens) {
    this.tokens = tokens;
  }

  public static Memento of(List<Token> tokens) {
    return new Memento(deepCopy(tokens));
  }

  public List<Token> getTokens() {
    return new ArrayList<>(tokens);
  }

  private static List<Token> deepCopy(List<Token> tokens) {
    return tokens.stream()
            .map(t -> new Token(t.getValue()))
            .collect(Collectors.toList());
  }
}
