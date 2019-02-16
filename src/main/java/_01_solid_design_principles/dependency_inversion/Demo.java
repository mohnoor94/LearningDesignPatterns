package _01_solid_design_principles.dependency_inversion;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Person parent = new Person("John");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Matt");

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent, child1);
        relationships.addParentAndChild(parent, child2);

        Research research = new Research();
        List<Person> children = research.search(relationships, "John", Relationship.PARENT);

        children.forEach(ch -> System.out.println(ch.getName()));
    }
}
