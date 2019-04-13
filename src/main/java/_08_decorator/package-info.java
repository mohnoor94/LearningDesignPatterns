package _08_decorator;

// Decorator: Adding behaviour without altering the class itself

// Motivation:
// - Want to augment an object with additional functionality
// - Do not want to rewrite or alter exciting code (OCP)
// - Want to keep new functionality separate
// - Need to be able to interact with existing structures

// You have two options:
// - Inherit from the required object if possible; some classes are fina;
// Build a decorator, which simply references the decorator object(s)

// Decorator: Facilitates the addition of behaviors to individual objects without inheriting from them.


// =====


// Summary:
// Decorator keeps the reference to the decorator object(s)

// May or may not forward calls
// - IDE can generate delegated methods!

// Exist in a static variation
// X<Y<Foo>> (
//      // unpleasant constructor args
// )
// - Very limited in Java due to:
// -- Type erasure
// -- Inability to inherit from type parameters