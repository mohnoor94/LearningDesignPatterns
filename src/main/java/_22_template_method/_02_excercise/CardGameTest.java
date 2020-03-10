package _22_template_method._02_excercise;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CardGameTest {
  @Test
  public void impasseTest() {
    Creature c1 = new Creature(1, 2);
    Creature c2 = new Creature(1, 2);
    TemporaryCardDamageGame game = new TemporaryCardDamageGame(new Creature[]{c1, c2});
    assertEquals(-1, game.combat(0, 1));
    assertEquals(-1, game.combat(0, 1));
  }

  @Test
  public void temporaryMurderTest() {
    Creature c1 = new Creature(1, 1);
    Creature c2 = new Creature(2, 2);
    TemporaryCardDamageGame game = new TemporaryCardDamageGame(new Creature[]{c1, c2});
    assertEquals(1, game.combat(0, 1));
  }

  @Test
  public void doubleMurderTest() {
    Creature c1 = new Creature(2, 2);
    Creature c2 = new Creature(2, 2);
    TemporaryCardDamageGame game = new TemporaryCardDamageGame(new Creature[]{c1, c2});
    assertEquals(-1, game.combat(0, 1));
  }

  @Test
  public void permanentDamageDeathTest() {
    Creature c1 = new Creature(1, 2);
    Creature c2 = new Creature(1, 3);
    CardGame game = new PermanentCardDamageGame(new Creature[]{c1, c2});
    assertEquals(-1, game.combat(0, 1));
    assertEquals(1, game.combat(0, 1));
  }
}