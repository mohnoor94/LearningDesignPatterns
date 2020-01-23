package _14_interpreter;

// Interpreter:

// Textual inputs needs to be processed!
// E.g., turned into OOP structures

// Interpreter: A component that processes structured text data. Does so by:
// - turning it into separate lexical tokens (lexing), and then
// - interpreting sequences of said tokens (parsing).

// =====

// Examples:
// - Programming language compilers, interpreters and IDEs
// - HTML, XML, ... parsers
// - Numeric Expression (3+4/5)
// - Regular Expressions

// =====

// ANTLR (Another Tool for Language Recognition) is a powerful parser generator for reading, processing, executing,
// or translating structured text or binary files.
// It can be used for big projects instead of handmade interpreters!

// =====

// Summary:


// - Barring simple cases, an interpreter acts in two stages: lexing and parsing
// - Lexing turns text into a set of tokens
// -- example: 3*(4+5) => Literal[3], Star, LeftParen, Literal[4], Plus, Literal[5], RightParen
// - PArsing tokens into meaningful constructs.
// -- previous example =>
/*
MultiplicationExpression[
    Integer[3],
    AdditionExpression[
        Integer[4], Integer[5]
    ]
]
 */
// Parsed data can then be traversed, interpreted, or transformed to do whatever you want.