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

