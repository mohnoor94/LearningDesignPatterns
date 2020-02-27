package _17_memento._02_excercise;

// A `TokenMachine` is in charge of keeping tokens. Each `Token` is a reference type with a single numerical value.
// The machine supports adding tokens and, when it does, it returns a memento representing the state of that system at
// that given time.

// You are asked to fill in the gaps and implement the Memento design pattern for this scenario. Pay close attention to
// the situation where a token is fed in as a reference and its value is subsequently changed on that reference - you
// still need to return the correct system snapshot!

// Initial Code:

/*
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Token
{
  public int value = 0;

  public Token(int value)
  {
    this.value = value;
  }
}

class Memento
{
  public List<Token> tokens = new ArrayList<>();
}

class TokenMachine
{
  public List<Token> tokens = new ArrayList<>();

  public Memento addToken(int value)
  {
    // ...
  }

  public Memento addToken(Token token)
  {
    // ...
  }

  public void revert(Memento m)
  {
    // ...
  }
}
 */