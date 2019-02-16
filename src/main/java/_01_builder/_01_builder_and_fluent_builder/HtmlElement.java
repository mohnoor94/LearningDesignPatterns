package _01_builder._01_builder_and_fluent_builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HtmlElement {

    private String name;
    private String text;
    private List<HtmlElement> elements = new ArrayList<>();

    private final int indentSize = 2;
    private final String newLine = System.lineSeparator();

    public HtmlElement() {
    }

    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }

    private String build(int level) {
        StringBuilder sb = new StringBuilder();
        String i = String.join("", Collections.nCopies(indentSize * level, " "));
        sb.append(String.format("%s<%s>%s", i, name, newLine));

        if (text != null && !text.isEmpty()) {
            sb.append(String.join("", Collections.nCopies(indentSize * (level + 1), " ")))
                    .append(text)
                    .append(newLine);
        }

        elements.forEach(e -> sb.append(e.build(level + 1)));

        sb.append(String.format("%s</%s>%s", i, name, newLine));

        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addElement(HtmlElement element) {
        elements.add(element);
    }

    @Override
    public String toString() {
        return build(0);
    }
}
