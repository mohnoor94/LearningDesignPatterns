package _16_mediator._01_chat_room;

public class Demo {

  public static void main(String[] args) {
    final ChatRoom room = new ChatRoom();
    final Person john = new Person("John");
    final Person jane = new Person("Jane");
    final Person simon = new Person("Simon");

    room.join(john);
    room.join(jane);

    john.broadcast("hi room!");
    jane.broadcast("oh, hi John!");

    room.join(simon);

    simon.broadcast("Hi everyone!");
    jane.send("Simon", "Glad you could join us!");
  }
}
