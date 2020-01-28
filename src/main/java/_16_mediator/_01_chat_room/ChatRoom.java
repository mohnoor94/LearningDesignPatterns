package _16_mediator._01_chat_room;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
  private List<Person> people = new ArrayList<>();

  public void join(Person person) {
    broadcast("room", person.getName() + " joined the room!");
    person.setRoom(this);
    people.add(person);
  }

  public void broadcast(String source, String message) {
    people.stream()
            .filter(person -> !person.getName().equals(source))
            .forEach(person -> person.receive(source, message));
  }

  public void send(String source, String destination, String message) {
    people.stream()
            .filter(p -> p.getName().equals(destination))
            .findFirst()
            .ifPresent(person -> person.receive(source, message));
  }
}
