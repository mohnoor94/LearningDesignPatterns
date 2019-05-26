package _10_flyweight;

// Flyweight: Space optimization!

// A space optimization technique that lets us use less memory by storing externally the data associated with similar
// objects.


// =====


// Summary:
// - Store common data externally
// - Specify an index or a reference into the external data source
// - Define the idea of 'ranges' on homogeneous collections and store data related to those ranges
// - Don't forget String.intern()