package _16_mediator._03_exercise;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
  private List<Participant> participants = new ArrayList<>();

  public void join(Participant participant) {
    participants.add(participant);
  }

  public void broadcast(Participant participant, int n) {
    participants.stream()
            .filter(p -> p != participant)
            .forEach(p -> p.increaseValue(n));
  }
}
