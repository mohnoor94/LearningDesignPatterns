package _01_solid_design_principles.open_closed.specification_implementation;

import _01_solid_design_principles.open_closed.Product;
import _01_solid_design_principles.open_closed.Size;

public class SizeSpecification implements Specification<Product> {

    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getSize() == this.size;
    }
}
