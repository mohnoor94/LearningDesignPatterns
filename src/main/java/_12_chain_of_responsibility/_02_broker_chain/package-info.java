package _12_chain_of_responsibility._02_broker_chain;

// Command Query Separation (CQS):

// Command: Asking for an action or change
// - e.g., please set attack value to 2

// Query: Asking for information
// - e.g., please give me your attack value

// CQS: Having separate means of sending commands and queries to e.g., direct field access.

// =====

// Note: This implement multiple design patterns in addition to Chain of Responsibility, like Observer, Mediator and
// Memento!

// =====

// Here you don't have to apply all the modifiers to a creature, but we will apply the modifier while it's actually
// there!