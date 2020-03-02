package _19_observer._01_observer_and_observable;

import java.util.ArrayList;
import java.util.List;

public class Observable<T> {
  private List<Observer<T>> observers = new ArrayList<>();

  public void subscribe(Observer<T> observer) {
    observers.add(observer);
  }

  // notify every subscriber that something is happened!
  protected void propertyChanged(T source, String propertyName, Object newValue) {
    observers.forEach(o -> o.handle(new PropertyChangedEventArgs<>(source, propertyName, newValue)));
  }
}
