package _07_composite._01_using_children;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// not abstract, you can instantiate the basic class to act as a group of different objects.
public class GraphicObject {
    protected String name = "Group";
    private String color;
    private List<GraphicObject> children = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<GraphicObject> getChildren() {
        return children;
    }

    public void setChildren(List<GraphicObject> children) {
        this.children = children;
    }

    public void addChild(GraphicObject child) {
        children.add(child);
    }

    private void print(StringBuilder builder, int depth) {
        builder.append(String.join("", Collections.nCopies(depth, "*")))
                .append(depth > 0 ? " " : "")
                .append(color == null || color.isBlank() ? "" : color + " ")
                .append(getName())
                .append(System.lineSeparator());

        children.forEach(child -> child.print(builder, depth + 1));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        print(sb, 0);
        return sb.toString();
    }
}
