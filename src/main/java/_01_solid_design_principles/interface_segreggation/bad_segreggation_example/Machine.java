package _01_solid_design_principles.interface_segreggation.bad_segreggation_example;

import _01_solid_design_principles.interface_segreggation.Document;

public interface Machine {

    void print (Document document);
    void scan (Document document);
    void fax (Document document);
}
