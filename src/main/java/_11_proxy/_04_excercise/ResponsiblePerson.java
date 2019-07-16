package _11_proxy._04_excercise;

public class ResponsiblePerson {
    private Person person;

    public ResponsiblePerson(Person person) {
        this.person = person;
    }

    public void setAge(int value) {
        person.setAge(value);
    }

    public int getAge() {
        return person.getAge();
    }

    public String drink() {
        return (person.getAge() >= 18) ? person.drink() : "too young";
    }

    public String drive() {
        return (person.getAge() >= 16) ? person.drive() : "too young";
    }

    public String drinkAndDrive() {
        return "dead";
    }
}
