package _05_adapter._01_adapter;

// here we have point's draw method but we do not have such a utility for a line
// so we added a LineToPointAdapter which helps in, obviously, adapting our lines
// to groups of points so we can use our draw method (drawPoint) with lines!