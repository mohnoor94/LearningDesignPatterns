package _22_template_method._02_excercise;

class TemporaryCardDamageGame extends CardGame {
  public TemporaryCardDamageGame(Creature[] creatures) {
    super(creatures);
  }

  @Override
  protected void hit(Creature attacker, Creature other) {
    int oldHealth = other.health;
    other.health -= attacker.attack;
    if (other.health > 0) other.health = oldHealth;
  }
}
