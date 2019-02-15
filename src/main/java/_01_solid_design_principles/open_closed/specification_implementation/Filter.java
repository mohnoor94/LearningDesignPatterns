package _01_solid_design_principles.open_closed.specification_implementation;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {

    Stream<T> filter (List<T>items, Specification<T> spec);
}
