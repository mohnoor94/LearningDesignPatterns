package _21_stategy._02_static_strategy;

interface ListStrategy {
  default void start(StringBuilder stringBuilder) {
  }

  void addListItem(StringBuilder stringBuilder, String item);

  default void end(StringBuilder stringBuilder) {
  }
}