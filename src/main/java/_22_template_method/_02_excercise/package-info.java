package _22_template_method._02_excercise;

// Imagine a typical collectible card game which has cards representing creatures.
// Each creature has two values: Attack and Health.
// Creatures can fight each other, dealing their Attack damage, thereby reducing their opponent's health.

// The class `CardGame` implements the logic for two creatures fighting one another.
// However, the exact mechanics of how damage is dealt is different:
// - `TemporaryCardDamageGame`: In some games (e.g., Magic:&nbsp;the Gathering), unless the creature has been killed,
// its health returns to the original value at the end of combat.
// - `PermanentCardDamageGame`: In other games (e.g., Hearthstone), health damage persists.

// You are asked to implement classes `TemporaryCardDamageGame` and `PermanentCardDamageGame` that would allow us to
// simulate combat between creatures.

// Some examples:
// - With temporary damage, creatures 1/2 and 1/3 can never kill one another. With permanent damage, second creature
// will win after 2 rounds of combat.
// - With either temporary or permanent damage, two 2/2 creatures kill one another.

// Initial Code:

/* class Creature
{
  public int attack, health;

  public Creature(int attack, int health)
  {
    this.attack = attack;
    this.health = health;
  }
}

abstract class CardGame
{
  public Creature [] creatures;

  public CardGame(Creature[] creatures)
  {
    this.creatures = creatures;
  }

  // returns -1 if no clear winner (both alive or both dead)
  public int combat(int creature1, int creature2)
  {
    Creature first = creatures[creature1];
    Creature second = creatures[creature2];
    hit(first, second);
    hit(second, first);
    // ...: determine who won and return either creature1 or creature2
  }

  // attacker hits other creature
  protected abstract void hit(Creature attacker, Creature other);
}

class TemporaryCardDamageGame extends CardGame
{
  // ...
}

class PermanentCardDamageGame extends CardGame
{
    // ...
}

 */