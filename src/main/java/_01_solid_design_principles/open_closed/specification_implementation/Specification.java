package _01_solid_design_principles.open_closed.specification_implementation;

public interface Specification<T> {

    boolean isSatisfied(T item);
}
