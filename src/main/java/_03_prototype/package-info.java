package _03_prototype;

// Complicated objects (e.g., cars) are not designed from scratch.
// They reiterate existing designs

// An existing (partially or fully constructed) design is a Prototype.

// We make a copy (clone) he prototype and customize it.
// This require 'deep copy' support

// We make the cloning convenient (e.g., via a Factory)


// ---

// Prototype: A partially or fully initialized object that you copy (clone) and make use of.

// ---

// The use of cloneable interface and clone method is not recommended.

// ---

// Copy Constructor:
// You have to make a copy constructor for every type in your hierarchy
// For example, we make a copy constructor for Address class only to be
// used with our copy constructor in Employee class.

// ---

// Copy through Serialization
// Simply serialize and then deserialize your object and you will get a
// new 'deep' copy out of it.
// Other idea is to use reflection to do the same thing.