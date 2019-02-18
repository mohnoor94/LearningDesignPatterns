package _02_factories;

// - Object creation logic becomes too convoluted

// - Constructor is not descriptive
// -- Name mandated by name of containing type (class)
// -- Cannot overload with same set of arguments with different names
// -- Can turn into 'overloading hell'

// - Wholesale object creation (non-piecewise, unlike Builder) can be outsourced to:
// -- A separate function (Factory Method)
// -- That my exist in  separate class (Factory)
// -- Can create hierarchy of factories with Abstract Factory

// Factory: A component responsible solely for the wholesale (not piecewise) creation of objects.


// Summary
// A factory method is a static method that create objects
// A factory can take care of object creation
// A factory can be external or reside inside the object as an inner class
// Hierarchies of factories can be used to create related objects