package _00_solid_design_principles.open_closed.specification_implementation;

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
        FilterImpl filter = new FilterImpl();


        System.out.println("Green Products (second - better - implementation): ");
        filter.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println("- " + p.getName() + " is green"));

        System.out.println("------");

        System.out.println("Large blue items: ");
        filter.filter(products, new AndSpecification<>(
                new ColorSpecification(Color.BLUE),
                new SizeSpecification(Size.LARGE)
        )).forEach(p -> System.out.println("- " + p.getName() + " is large and blue"));
    }
}
