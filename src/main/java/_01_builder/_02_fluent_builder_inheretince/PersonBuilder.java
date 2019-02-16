package _01_builder._02_fluent_builder_inheretince;

// <SELF extends PersonBuilder<SELF>> called recursive generic
public class PersonBuilder<SELF extends PersonBuilder<SELF>> {

    protected Person person = new Person();

    public SELF withName(String name) {
        person.setName(name);
        return self();
    }

    public Person build() {
        return person;
    }

    @SuppressWarnings("unchecked")
    protected SELF self() {
        return (SELF) this;
    }
}
