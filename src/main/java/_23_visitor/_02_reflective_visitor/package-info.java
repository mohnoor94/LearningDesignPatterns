package _23_visitor._02_reflective_visitor;

// We have the Expression class which has a lot of subclasses.
// We need to add the `print` functionality to it.
// Here, we used the reflective visitor, which uses reflection, which is slow.
// Another problem is that we lost the kind of verification to support the `print` method as we did in the intrusive
// visitor (we can forget some branches from printing).