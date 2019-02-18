package _02_factories._01_factory_method;

// The problem here is we want to create a class 'Point'
// which can be initialized either with 2 cartesian points (x, y)
// or 2 polar values (rho, theta).
// We cannot have 2 constructors each of them have 2 double parameters

// Solutions:
// - A bad solution in class BadPoint
// - A good solution in class GoodPoint (with factory methods)