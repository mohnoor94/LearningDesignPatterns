package _01_builder._04_excercise_code_builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CodeBuilder {

    private String className;
    private List<Field> fields = new ArrayList<>();

    private static final String NEW_LINE = System.lineSeparator();
    private static final int INDENTATION = 2;

    public CodeBuilder(String className) {
        this.className = className;
    }

    public CodeBuilder addField(String name, String type) {
        fields.add(new Field(type, name));
        return this;
    }

    public void reset() {
        this.fields.clear();
    }

    private String build() {
        StringBuilder sb = new StringBuilder();
        sb.append("public class ")
                .append(className)
                .append(" {")
                .append(NEW_LINE);

        fields.forEach(f ->
                sb.append(String.join("", Collections.nCopies(INDENTATION, " ")))
                        .append(f.toString())
                        .append(NEW_LINE));

        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toString() {
        return build();
    }
}