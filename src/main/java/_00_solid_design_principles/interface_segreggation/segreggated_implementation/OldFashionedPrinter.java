package _00_solid_design_principles.interface_segreggation.segreggated_implementation;

import _00_solid_design_principles.interface_segreggation.Document;

public class OldFashionedPrinter implements Printer {

    @Override
    public void print(Document document) {
        // implementation details

        System.out.println("printed");
    }
}
