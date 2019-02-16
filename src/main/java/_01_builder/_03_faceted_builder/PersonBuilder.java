package _01_builder._03_faceted_builder;

// facade builder
public class PersonBuilder {

    protected Person person = new Person();

    public PersonInfoBuilder identity() {
        return new PersonInfoBuilder(person);
    }

    public PersonAddressBuilder lives() {
        return new PersonAddressBuilder(person);
    }

    public PersonJobBuilder works() {
        return new PersonJobBuilder(person);
    }

    public Person build() {
        return person;
    }
}
