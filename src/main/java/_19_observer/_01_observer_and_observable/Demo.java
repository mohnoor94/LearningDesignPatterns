package _19_observer._01_observer_and_observable;

public class Demo implements Observer<Person> {

  public static void main(String[] args) {
    final Demo demo = new Demo();

    final Person person = new Person();
    person.subscribe(demo);

    for (int i = 20; i < 24; i++) person.setAge(i);
  }

  @Override
  public void handle(PropertyChangedEventArgs<Person> args) {
    System.out.println("Person's " + args.getPropertyName() + " has changed to " + args.getNewValue());
  }
}
