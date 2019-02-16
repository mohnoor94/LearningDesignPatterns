package _00_solid_design_principles.dependency_inversion;

import java.util.List;

public interface RelationshipBrowser {

    List<Person> findAllOf(String name, Relationship relationship);
}