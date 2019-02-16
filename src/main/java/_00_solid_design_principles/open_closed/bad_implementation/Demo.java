package _00_solid_design_principles.open_closed.bad_implementation;

import _00_solid_design_principles.open_closed.Color;
import _00_solid_design_principles.open_closed.Product;
import _00_solid_design_principles.open_closed.Size;

import java.util.List;

public class Demo {

    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(apple, tree, house);
        BadProductFilter badProductFilter = new BadProductFilter();

        System.out.println("Green Products (first - bad - implementation): ");
        badProductFilter.filterByColor(products, Color.GREEN)
                .forEach(p -> System.out.println("- " + p.getName() + " is green"));
    }
}
