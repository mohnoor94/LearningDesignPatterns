package _12_chain_of_responsibility;

// Chain of Responsibility: Sequence of handlers processing an event one after another

// A chain of components who all get a chance to process a command or a query, optionally having default processing
// implementation and an ability to terminate the process.

// =====

// Summary:

// Chain of Responsibility can be implemented as a chain of references or a centralized construct
// Enlist objects in the chain, possibly controlling their order.
// Object removal from chain (e.g., in AutoClosable's close() method) in EventBroker example.
