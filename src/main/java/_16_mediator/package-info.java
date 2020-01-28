package _16_mediator;

// Mediator:
// - Facilitates communication between components
// A component that facilitates communication between other components without them necessarily being aware of each
// other or having direct (reference) access to each other.

// =====

// Motivation:

// - Components may go in and out of a system at any time, e.g.,
// -- Chat room participants
// -- Players in an online game

// - It makes no sense for them to have direct references to one another
// -- They references may go dead at any time!

// Solution: have them all refer to some central component that facilitates communication

// =====

// Everyone has a reference to the mediator but no other components.

// =====

// Summary:

// - Create the mediator and have each object in the system refer to it, e.g., in a field (Constructor Injection?).
// - Mediator is typically a singleton - only one instance is needed.
// - Mediator engages bidirectional communication with its connected component.
// - Mediator has functions the components can call.
// - Components have functions the mediator can call.
// - Event processing (e.g., Rx) libraries make communication easier to implement.
