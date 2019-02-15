package _01_solid_design_principles.interface_segreggation.bad_segreggation_example;

import _01_solid_design_principles.interface_segreggation.Document;

public class MultiFunctionMachine implements Machine{
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

    @Override
    public void fax(Document document) {
        // implementation details

        System.out.println("sent");
    }
}
