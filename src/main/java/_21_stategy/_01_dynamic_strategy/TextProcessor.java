package _21_stategy._01_dynamic_strategy;

import java.util.List;
import java.util.function.Supplier;

class TextProcessor {
  private StringBuilder stringBuilder = new StringBuilder();
  private ListStrategy listStrategy;

  public TextProcessor(OutputFormat format) {
    setOutputFormat(format);
  }

  public void setOutputFormat(OutputFormat format) {
    switch (format) {
      case MARKDOWN:
        listStrategy = new MarkdownListStrategy();
        break;
      case HTML:
        listStrategy = new HtmlListStrategy();
        break;
    }
  }

  // the skeleton algorithm is here
  public void appendList(List<String> items) {
    listStrategy.start(stringBuilder);
    items.forEach(item -> listStrategy.addListItem(stringBuilder, item));
    listStrategy.end(stringBuilder);
  }

  public void clear() {
    stringBuilder.setLength(0);
  }

  @Override
  public String toString() {
    return stringBuilder.toString();
  }
}
