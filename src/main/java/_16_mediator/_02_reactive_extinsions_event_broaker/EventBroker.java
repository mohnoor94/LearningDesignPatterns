package _16_mediator._02_reactive_extinsions_event_broaker;

import io.reactivex.Observable;
import io.reactivex.Observer;

import java.util.ArrayList;
import java.util.List;

public class EventBroker extends Observable<Integer> {
  private List<Observer<? super Integer>> observers = new ArrayList<>();

  @Override
  protected void subscribeActual(Observer<? super Integer> observer) {
    observers.add(observer);
  }

  public void publish(int n) {
    observers.forEach(observer -> observer.onNext(n));
  }
}