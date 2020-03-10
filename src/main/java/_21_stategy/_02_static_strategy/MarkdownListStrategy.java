package _21_stategy._02_static_strategy;

class MarkdownListStrategy implements ListStrategy {
  @Override
  public void addListItem(StringBuilder stringBuilder, String item) {
    stringBuilder.append(" * ").append(item)
            .append(System.lineSeparator());
  }
}
