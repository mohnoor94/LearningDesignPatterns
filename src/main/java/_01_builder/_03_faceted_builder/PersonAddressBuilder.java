package _01_builder._03_faceted_builder;

public class PersonAddressBuilder extends PersonBuilder {

    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder at(String streetAddress) {
        person.setStreetAddress(streetAddress);
        return this;
    }

    public PersonAddressBuilder in(String city) {
        person.setCity(city);
        return this;
    }

    public PersonAddressBuilder withPostcode(String postcode) {
        person.setPostcode(postcode);
        return this;
    }
}
