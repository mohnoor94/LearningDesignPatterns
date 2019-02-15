package _01_solid_design_principles.open_closed.specification_implementation;

import _01_solid_design_principles.open_closed.Color;
import _01_solid_design_principles.open_closed.Product;

public class ColorSpecification implements Specification<Product> {

    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getColor() == this.color;
    }
}
