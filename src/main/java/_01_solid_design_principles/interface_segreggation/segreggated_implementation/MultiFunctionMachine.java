package _01_solid_design_principles.interface_segreggation.segreggated_implementation;

import _01_solid_design_principles.interface_segreggation.Document;

public class MultiFunctionMachine implements MultiFunctionDevice {

    // Decorator design pattern, to reuse your already implemented functionality in other places
    private Printer printer;
    private Scanner scanner;
    private Fax fax;

    public MultiFunctionMachine(Printer printer, Scanner scanner, Fax fax) {
        this.printer = printer;
        this.scanner = scanner;
        this.fax = fax;
    }

    @Override
    public void send(Document document) {
        fax.send(document);
    }

    @Override
    public void print(Document document) {
        printer.print(document);
    }

    @Override
    public void scan(Document document) {
        scanner.scan(document);
    }
}
