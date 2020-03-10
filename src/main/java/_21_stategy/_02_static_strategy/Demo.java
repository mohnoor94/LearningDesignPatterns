package _21_stategy._02_static_strategy;

import java.util.List;

class Demo {
  public static void main(String[] args) {
    TextProcessor<MarkdownListStrategy> tp = new TextProcessor<>(MarkdownListStrategy::new);
    tp.appendList(List.of("liberte", "egalite", "fraternite"));
    System.out.println(tp);

    TextProcessor<HtmlListStrategy> tp2 = new TextProcessor<>(HtmlListStrategy::new);
    tp2.appendList(List.of("inheritance", "encapsulation", "polymorphism"));
    System.out.println(tp2);
  }
}