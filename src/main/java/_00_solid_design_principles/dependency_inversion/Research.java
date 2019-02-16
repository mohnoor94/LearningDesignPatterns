package _00_solid_design_principles.dependency_inversion;

import java.util.List;

// High-Level module (Business class)
public class Research {

    // This is will not work now
//    public List<Person> search (Relationships relationships, String name, Relationship relationship){
//        return relationships.getRelations().stream()
//                .filter(x -> x.getValue0().getName().equals(name)
//                        && x.getValue1() == relationship)
//                .map(Triplet::getValue2)
//                .collect(Collectors.toList());
//    }

    public List<Person> search (RelationshipBrowser browser, String name, Relationship relationship){
        return browser.findAllOf(name, relationship);
    }
}
