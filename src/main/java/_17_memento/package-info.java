package _17_memento;

// Memento
// - Keep a memento of an object;s state to return to that state.

// - A token/handle representing the system state. Let us rollback to the state when the token was generated. May or may
// not directly expose state information.

// =====

// Motivation:

// - An object or system goes thought changes
//  -- E.g., a bank account gets deposits and withdrawals

// - There are different ways of navigating those changes
//  -- One way is to record every change (Command) and teach a command to 'undo' itself.
//  -- Another way is to simply save snapshots of the system (memento).

// Memento is used for interoperability between different languages.

// =====

// Limitations:

// - We do not get a memento for the first state from a constructor, we have to solve this in another way since the
// constructor itself cannot return a memento.
//  -- E.g., Use a builder.

// - If we save every state this would consume a large amount of memory, especially if we have a lot of data to save
// for every state.
//  -- If we wanted to save every state, this would be the typical use of Command design pattern, so use it instead.
//    --- Command design pattern would use much less memory since it saves a list of changes not states.
//  -- Or, you may compress the data you save.


// =====

// Summary:

// - Mementos are used to roll back states arbitrarily.
// - A memento is simply a token/handle class with (typically) no functions of its owm.
// - A memento is not required to expose directly the state(s) to which it reverts the system.
// - Memento can be used ti implement undo/redo.