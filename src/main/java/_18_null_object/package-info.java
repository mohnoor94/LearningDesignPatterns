package _18_null_object;

// Null Object
// - A no-op object that conforms to the required interface, satisfying a dependency requirement of some other object.
// - it doesn't do anything
// - A behavioral design pattern with no behaviors :3


// =====

// Motivation:

// - When component A uses component B, it typically assumes that B is non-null
//  -- You inject B, not some `Optional<B>` Type
//  -- You do not check for null on every call

// - There is no option of telling A not to use aan instance of B
//  -- Its use is hard-coded

// - Thus, we build a no-op, non-functioning inheritor of B (or some interface that B implements) and pass it to A


// =====

// - Simple Null Object is okay but you have to create a new class for every type you have, this may be a problem for
// bigger projects.
// - A Dynamic Null Object is a good solution but it is computationally intensive and that's the price you have to pay.
//  -- Quick to build
//  -- It's okay if you have an enormous number of classes/type you want to build null alternatives copies of them.
//  -- If you want to use this in unit testing - as the performance won't be a bottleneck here!


// =====

// Summary:

// - Implement the required interface
// - Rewrite the methods with empty bodies
//  -- If method is non-void, return default value for a given type
//  -- If these values are ever used, you are in trouble!
// - Supply an instance of Null Object in place of actual object
// - Use a Dynamic Null Object only if you can afford it (Computationally Intensive)