package _19_observer;

// Observer
// - I am watching you!
// - An observer is an object that wishes to be informed about events happening in the system. The entity generating
// the events in an observable.

// =====

// Motivation:
// - We need to be informed when certain things happen:
//  -- Object's field changes
//  -- Object does something
//  -- Some external event occurs

// - We need to listen to events and notified when they occur

// - Typical (old) pattern involves `addXxxListener()`

// - Java now has functional objects:
//  -- `Supplier<T>`
//  -- `Consumer<T>`
//  -- `Function<T>`

// =====
// - The problem with observers and observables (01) is that they cannot extend any proper base classes!
//  -- We may turn these into interfaces with default members, but this will still be ugly and require a lot of work.
//  -- Or, better, use the idea of Events (02)!
//    --- This has multiple issues as well, e.g., if a value depends on another value, check `Person` class for
//    `canVote()` value!


// =====

// Summary:
// - Observer is an intrusive approach: an observable must provide an event to subscribe to.
// - Special care must be taken to prevent issues in multithreaded scenarios (specially to unsubscribe an event).
// - Rx (Reactive Extensions) uses `Observer<T>` / `Observable<T>`.