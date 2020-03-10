package _21_stategy._02_static_strategy;

import java.util.List;
import java.util.function.Supplier;

class TextProcessor<LS extends ListStrategy> {
  private StringBuilder stringBuilder = new StringBuilder();
  // cannot do this
  // private LS listStrategy = new LS();
  private LS listStrategy;

  public TextProcessor(Supplier<? extends LS> supplier) {
    listStrategy = supplier.get();
  }

  // the skeleton algorithm is here
  public void appendList(List<String> items) {
    listStrategy.start(stringBuilder);
    items.forEach(item -> listStrategy.addListItem(stringBuilder, item));
    listStrategy.end(stringBuilder);
  }

  @Override
  public String toString() {
    return stringBuilder.toString();
  }
}
