package _19_observer._02_event;

// We do not need to extend anything!
public class Person {
  private int age;
  private Event<PropertyChangedEventArgs<Person>> event = new Event<>();

  public int getAge() {
    return age;
  }

  public Event<PropertyChangedEventArgs<Person>> getEvent() {
    return event;
  }

  public void setAge(int age) {
    if (this.age == age) return; // nothing changed!
    this.age = age;
    final boolean oldCanVote = canVote(); // cache

    event.fire(new PropertyChangedEventArgs<>(this, "age", age));

    final boolean newCanVote = canVote();
    if (newCanVote != oldCanVote) event.fire(new PropertyChangedEventArgs<>(this, "canVote", newCanVote));
  }

  // problem with read-only properties
  // the solution above won't work if you have a lot od dependencies! - does not scale!
  // you may need to build custom dependency lists/trees to navigate all dependencies and update them or do whatever
  // actions you want.
  public boolean canVote() {
    return age >= 18;
  }
}
