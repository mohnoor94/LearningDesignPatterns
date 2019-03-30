package _06_bridge;

// Motivation: Connect components together through abstractions.

// Bridge prevents a 'Cartesian Product' complexity explosion. // TODO read more about this

// Bridge: A mechanism that decouples an interface (hierarchy) from an implementation (hierarchy).


// ---


// Code Example:
// Let's assume we have some geometric classes: Circle, Square, ...
// And some rendering classes: Vector, Raster

// If you implemented a class to use every combination of them, you will end up with 4 classes
// VectorCircleRenderer, RasterCircleRenderer, VectorSquareRenderer, RasterSquareRenderer,...
// what if you have 5x3 classes -> 15 class need to be implemented!
// ('Cartesian Product' complexity explosion problem)
// Obviously - this is not a valid solution...
// Instead, use a bridge design pattern!
// Let every class accept its renderer while building (internal field).


// ---

// Summary:
// - Decouples abstraction from implementation
// - Both can exists as hierarchies
// - You can think of it as a stronger form of encapsulation.