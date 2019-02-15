package _01_solid_design_principles.open_closed.specification_implementation;

import _01_solid_design_principles.open_closed.Product;

import java.util.List;
import java.util.stream.Stream;

public class FilterImpl implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(spec::isSatisfied);
    }
}