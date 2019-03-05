package _04_singleton;

// Motivation:

// For some components it only makes sense to have one in the system
// - Database repository
// - Object factory

// E.g., the constructor call is expensive
// - We only do it once
// - We provide everyone with the same instance

// Want to prevent anyone creating additional copies

// Need to take care of lazy instantiation and thread safety

// ---

// Singleton: A component which is instantiated only once.

// ---

// Singletons are hard to test

// Instead of directly using a singleton, consider depending on abstraction (e.g., an interface)
// - like what we did in package 07

// Consider defining singleton lifetime in DI (Dependency Injection) container instead of making it yourself
// - like Spring DI, ...