package _01_builder._03_faceted_builder;

public class PersonInfoBuilder extends PersonBuilder {

    public PersonInfoBuilder(Person person) {
        this.person = person;
    }

    public PersonInfoBuilder withName(String name) {
        person.setName(name);
        return this;
    }
}
