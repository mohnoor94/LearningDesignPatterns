package _04_singleton._02_static_block_singleton;

// We use this approach when we:
// - have a singleton constructor which may throw an exception
// so that we cannot easily instantiate it with a field
// - need to have some custom initialization or a bool of instances
// so that we can create all our logic inside the static block