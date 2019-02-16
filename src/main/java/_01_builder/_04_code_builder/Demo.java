package _01_builder._04_code_builder;

public class Demo {

    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Person")
                .addField("name", "String")
                .addField("age", "int");
        System.out.println(cb);

        System.out.println("-----");

        cb.reset();

        cb.addField("name", "String")
                .addField("id", "String")
                .addField("age", "int");

        System.out.println(cb);
    }
}