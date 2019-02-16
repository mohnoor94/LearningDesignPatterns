package _01_builder._03_faceted_builder;

public class Demo {

    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();

        Person person = pb
                .identity()
                    .withName("Mohammad")
                .lives()
                    .at("123 London Road")
                    .in("London")
                    .withPostcode("SW12BC")
                .works()
                    .at("Google")
                    .asA("Software Engineer")
                    .earning(15000)
                .build();

        System.out.println(person);
    }
}
