package _20_state._03_spring_statemachine;

// plural because SSM defines a class called State already
enum States {
  OFF_HOOK, // starting
  ON_HOOK, // terminal
  CONNECTING,
  CONNECTED,
  ON_HOLD
}