package _00_solid_design_principles.open_closed.bad_implementation;

import _00_solid_design_principles.open_closed.Color;
import _00_solid_design_principles.open_closed.Product;
import _00_solid_design_principles.open_closed.Size;

import java.util.List;
import java.util.stream.Stream;

public class BadProductFilter {

    public Stream<Product> filterByColor(List<Product> products, Color color){
        return products.stream().filter(p -> p.getColor() == color);
    }

    public Stream<Product> filterBySize(List<Product> products, Size size){
        return products.stream().filter(p -> p.getSize() == size);
    }

    public Stream<Product> filterBySizeAndColor(List<Product> products, Size size, Color color){
        return products.stream().filter(p -> p.getSize() == size && p.getColor() == color);
    }
}
