package _01_solid_design_principles.interface_segreggation.bad_segreggation_example;

import _01_solid_design_principles.interface_segreggation.Document;

public class OldFashionedPrinter implements Machine {
    @Override
    public void print(Document document) {
        // implementation details

        System.out.println("printed");
    }

    @Override
    public void scan(Document document) {
        // NOT SUPPORTED!
        // what to do?
        // --> Empty implementation!
        // --> throw notImplementedException! --> you should throw the exception in original class as well, and you
        // may have no control at it!
        // are all bad ideas!

        // stick to the ISP to solve this!
    }

    @Override
    public void fax(Document document) {
        // NOT SUPPORTED!
        // what to do?
        // --> Empty implementation!
        // --> throw notImplementedException! --> you should throw the exception in original class as well, and you
        // may have no control at it!
        // are all bad ideas!

        // stick to the ISP to solve this!
    }
}
