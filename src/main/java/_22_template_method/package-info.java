package _22_template_method;

// Template Method:
// - A high-level blueprint dor an algorithm to be completed by inheritors.
// - Allows us to define the 'skeleton' of the the algorithm, with concrete implementations defined in subclasses.
// - Same purpose of the `Strategy` design pattern but with a different implementations!

// =====

// Motivation:
// - Algorithms can be decomposed into common parts + specifics

// - Strategy pattern does this through composition
//  -- High-level algorithm uses an interface
//  -- Concrete implementations implement the interface

// - Template Method does the same thing through inheritance
//  -- Overall algorithm makes use of abstract members
//  -- Inheritors override the abstract members
//  -- Parent template method invoked


// =====

// Summary:
// - Define an algorithm at a high level.
// - Define constitute parts a abstract methods/properties.
// - Inherit the algorithm class, providing necessary overrides.