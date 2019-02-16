package _01_builder._01_builder_and_fluent_builder;

public class Demo {

    public static void main(String[] args) {
        HtmlBuilder builder = new HtmlBuilder("ul");

        builder.addChild("li", "hello")
                .addChild("li", "world");

        System.out.println(builder);
    }
}
