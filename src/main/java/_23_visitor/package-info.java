package _23_visitor;

// Visitor:
// - Allows adding extra behaviors to entire hierarchies of classes.
// - A class that defines a set of algorithms, called `visitors`, that are applied to the elements of a structure.
// - The `visitor` can be used to add new behaviors to the structure without changing the structure.

// =====

// Motivation:
// - Need to define a new operation on an entire class hierarchy.
// -- E.g., make a document model printable to HTML/Markdown.
// - Do not want to keep modifying every class in the hierarchy.
// - Need an external component which knows how to correctly traverse (and do something with) the entire hierarchy.
// - Need access to the non-common aspects of classes in the hierarchy.
// - Need to avoid type checks and casting (instance-of, comparing class values, etc.).

// =====

// Summary:
// - A pattern where a component (visitor) is allowed to traverse the entire inheritance hierarchy.
// - Implemented by propagating a single `visit()` method to all classes in the hierarchy.