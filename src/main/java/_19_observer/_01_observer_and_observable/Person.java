package _19_observer._01_observer_and_observable;

public class Person extends Observable<Person> {
  private int age;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (this.age == age) return; // nothing changed!
    this.age = age;
    propertyChanged(this, "age", age);
  }
}
