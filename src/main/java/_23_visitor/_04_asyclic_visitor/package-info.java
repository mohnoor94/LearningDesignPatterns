package _23_visitor._04_asyclic_visitor;

// We have the Expression class which has a lot of subclasses.
// We need to add the `print` functionality to it.
// Here, we will do it with the acyclic approach - The "Acyclic Visitor" pattern.
// Which will use the problem we faced with the "Double Dispatch" pattern (tight-coupling between the expression
// and tee visitor), so we can easily ignore certain elements from the hierarchy.
// We can disable any visitors temporarily, if we want.
// It is worth's to note that this way needed a lot of interfaces to be implemented - compared to the other ways.
// We also back to the idea of type-checking and casting which is not so great - performance wise.