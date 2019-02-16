package _00_solid_design_principles.interface_segreggation.segreggated_implementation;

import _00_solid_design_principles.interface_segreggation.Document;

// or, you can have an interface that extends both of these interfaces and implement it
public class PhotoCopier implements Printer, Scanner {

    @Override
    public void print(Document document) {
        // implementation details

        System.out.println("printed");
    }

    @Override
    public void scan(Document document) {
        // implementation details

        System.out.println("scanned");
    }
}
