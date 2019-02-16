package _01_builder._03_faceted_builder;

public class PersonJobBuilder extends PersonBuilder {

    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder at(String company) {
        person.setCompanyName(company);
        return this;
    }

    public PersonJobBuilder asA(String position) {
        person.setPosition(position);
        return this;
    }

    public PersonJobBuilder earning(int annualIncome) {
        person.setAnnualIncome(annualIncome);
        return this;
    }
}
