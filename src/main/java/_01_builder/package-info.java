package _01_builder;

// Some objects are simple and can be created in a single constructor call
// Other objects require a lot of ceremony to creat

// Having an object with 10 constructor arguments is not productive!
// Instead, opt for piecewise construction

// Builder provides an API for constructing an object step-by-step (piece-by-piece).

// ==> When piecewise object construction is complicated, provide an
// API for doing it succinctly.

// Fluent Builder: Always return the builder 'this' with your building methods
// so the user could build the pieces with long chains.

// Faceted builder: when you have a complicated object that has to use multiple builders
// to build it