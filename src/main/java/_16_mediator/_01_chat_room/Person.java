package _16_mediator._01_chat_room;

import java.util.ArrayList;
import java.util.List;

public class Person {
  private String name;
  private ChatRoom room;
  private List<String> chatLog = new ArrayList<>();

  public Person(String name) {
    this.name = name;
  }

  public void receive(String sender, String message) {
    final String str = sender + ": '" + message + "'";
    System.out.println("[" + name + "'s chat session] " + str);
    chatLog.add(str);
  }

  public void send(String destination, String message) {
    room.send(name, destination, message);
  }

  public void broadcast(String message) {
    room.broadcast(name, message);
  }

  public void setRoom(ChatRoom room) {
    this.room = room;
  }

  public String getName() {
    return name;
  }

  public ChatRoom getRoom() {
    return room;
  }
}
