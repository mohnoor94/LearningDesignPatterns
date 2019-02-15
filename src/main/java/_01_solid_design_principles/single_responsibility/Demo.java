package _01_solid_design_principles.single_responsibility;

import java.io.FileNotFoundException;

public class Demo {

    public static void main(String[] args) throws FileNotFoundException {
        Journal journal = new Journal();
        journal.addEntry("I cried today");
        journal.addEntry("I ate a bug");
        System.out.println(journal);

        Persistence persistence = new Persistence();
        persistence.save(journal, "journal.txt", true);
        persistence.load("journal.txt");
    }
}
