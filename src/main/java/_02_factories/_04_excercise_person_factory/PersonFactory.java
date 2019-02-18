package _02_factories._04_excercise_person_factory;

class PersonFactory {
    private static int id = 0;

    public static Person createPerson(String name) {
        return new Person(id++, name);
    }
}