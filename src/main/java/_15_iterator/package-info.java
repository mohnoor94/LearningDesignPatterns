package _15_iterator;

// Iterator:
// An object the facilitates the traversal of a data structure.

// =====

// Motivation:
// - Iteration (traversal) is a core functionality of various data structures

// - An `iterator` is a class that facilitates the traversal
// -- Keeps a reference to the current element
// -- Knows how to move to a different element

// =====

// Java hs `Iterator<T>` and `Iterable<T>`
// - `Iterator<T>` specifies the iterator API
// - A class needs to be `Iterable` in order to support enhanced for loop: `for (Foo foo: bar)`

// =====

// Summary:
// - An iterator specified how you can travers an object
// - Iterator cannot be recursive (no coroutines)
// - Iterator implements `Iterator<T>z, iterable object implements `Iterable<T>`