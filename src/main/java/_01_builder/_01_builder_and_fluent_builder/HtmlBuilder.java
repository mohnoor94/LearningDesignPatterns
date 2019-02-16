package _01_builder._01_builder_and_fluent_builder;

public class HtmlBuilder {

    private String rootName;
    private HtmlElement root = new HtmlElement();

    public HtmlBuilder(String rootName) {
        this.rootName = rootName;
        root.setName(rootName);
    }

    public HtmlBuilder addChild(String childName, String childText) {
        root.addElement(new HtmlElement(childName, childText));
        return this;
    }

//    public void addChild(String childName, String childText) {
//        root.addElement(new HtmlElement(childName, childText));
//    }

    public void clear() {
        root = new HtmlElement();
        root.setName(rootName);
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
