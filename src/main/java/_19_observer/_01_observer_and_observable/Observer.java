package _19_observer._01_observer_and_observable;

public interface Observer<T> {
  void handle(PropertyChangedEventArgs<T> args);
}
