package _20_state._02_handmade;

enum State
{
  OFF_HOOK, // starting
  ON_HOOK, // terminal
  CONNECTING,
  CONNECTED,
  ON_HOLD
}