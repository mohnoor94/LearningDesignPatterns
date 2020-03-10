package _21_stategy;

// Strategy:
// - System behavior partially specified at runtime.
// - Enables the exact behavior of a system to be selected either at run-time (dynamic) or compile-time (static).
// - Also know as a `Policy` (esp. in the C++ world).

// =====

// Motivation:

// - Many algorithms can be decomposed into higher- and lower- level parts.

// - Making tea can be decomposed into:
//  -- The process of making a hot beverage (boil water, pour into cup); and
//  -- Tea-specific things (put teabag into water)

// - The high-level algorithm can then be reused for making coffee or hot chocolate
//  -- Supported by beverage-specific strategy


// =====

// Summary:
// - Define an algorithm at a high-level.
// - Define the interface you expect each strategy to follow.
// - Provide for either dynamic or static composition of strategy in the overall algorithm.