package _19_observer._02_event;

// We do not need to extend anything!
public class Demo {

  public static void main(String[] args) {
    final Person person = new Person();

    // Event to fire!
    final Subscription<PropertyChangedEventArgs<Person>> sub = person.getEvent().addHandler(x ->
            System.out.println("Person's " + x.getPropertyName() + " has changed to " + x.getNewValue())
    );

    person.setAge(20);
    person.setAge(21);
    person.setAge(22);

    sub.close(); // unsubscribe!

    person.setAge(100); // you won't be notified to this!
  }
}
