package _07_composite;

// Goal: Treating individual and aggregate objects uniformly

// Motivation:
// - Objects use other objects' fields and methods through inheritance and composition
// - Composition ets us make compound objects
// -- E.g., a mathematical expression composed of simple expressions, or
// -- A shape group made of several different shapes

// - Composite design pattern is used to treat both single (scalar) and composite objects uniformly.
// -- I.e., Foo and List<Foo> have common APIs

// Composite Design Pattern: A mechanism for treating individual (scalar) objects and compositions of objects
// in  uniform manner.

//

// Java supports container iteration with the Iterable<T> interface
// --> even for a single element (with Collections.singleton(..))

// - A single object can masquerade as a collection by returning a single-element collection
// containing only `this`