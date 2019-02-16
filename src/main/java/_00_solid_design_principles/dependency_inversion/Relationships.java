package _00_solid_design_principles.dependency_inversion;

import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Low-Level module
public class Relationships implements RelationshipBrowser{

    private List<Triplet <Person, Relationship, Person>> relations = new ArrayList<>();

    public void addParentAndChild(Person parent, Person child){
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, parent));
    }

    // This is so wrong!!! we depend on low-module (storage) to do our logic!
    // solution is to depend on the RelationshipBrowser interface (Abstraction)
    // if you decided to change how you store relations you have to change
    // your code elsewhere. But with our solution, no need for that.
//    public List<Triplet<Person, Relationship, Person>> getRelations() {
//        return relations;
//    }

    @Override
    public List<Person> findAllOf(String name, Relationship relationship) {
        return relations.stream()
                .filter(x -> name.equals(x.getValue0().getName())
                        && x.getValue1() == relationship)
                .map(Triplet::getValue2)
                .collect(Collectors.toList());
    }
}
