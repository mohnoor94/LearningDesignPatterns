package _21_stategy._02_static_strategy;

class HtmlListStrategy implements ListStrategy {
  @Override
  public void start(StringBuilder stringBuilder) {
    stringBuilder.append("<ul>").append(System.lineSeparator());
  }

  @Override
  public void addListItem(StringBuilder stringBuilder, String item) {
    stringBuilder.append("  <li>")
            .append(item)
            .append("</li>")
            .append(System.lineSeparator());
  }

  @Override
  public void end(StringBuilder stringBuilder) {
    stringBuilder.append("</ul>").append(System.lineSeparator());
  }
}