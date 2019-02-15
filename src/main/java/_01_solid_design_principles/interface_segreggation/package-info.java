package _01_solid_design_principles.interface_segreggation;

// Interface Segregation Principle (ISP)
// YAGNI: You Ain't Going to Need it
// if you don't really something/method in some class/interface, do not add it!
// Segregate it to another place.

// you should add the absolute minimum amount of methods/code to each interface

// Takeaway: Instead of sticking everything in a single interface
// you should add the absolute minimum of code into an interface so that
// at NO POINT does a client (developer) has to implement a method he/she do not need at all!