package _23_visitor._03_double_dispatch;

// We have the Expression class which has a lot of subclasses.
// We need to add the `print` functionality to it.
// Here, we will do it the "classic" way - The "Double Dispatch" pattern.
// Now we get the benefits of both of the previous approaches:
// - We verify every new expression will be accepted by the visitor. By implementing both the `accept` and `visit`
// methods.
// - We have a good code (not slow - we don't have reflection).
// In addition, we can add any new visitor to the system without changing the hierarchy (the Expression subclasses).
// But, it can be a bit tricky to add a new visitor, if you want to "ignore" a particular element in the hierarchy.
// Because of the tight-coupling between the visitor and the expression (The cyclic dependency between the two).