package _02_factories._04_excercise_person_factory;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Person> people = List.of(PersonFactory.createPerson("Mohammad"),
                PersonFactory.createPerson("Ali"),
                PersonFactory.createPerson("Alix"));

        people.forEach(System.out::println);
    }
}
