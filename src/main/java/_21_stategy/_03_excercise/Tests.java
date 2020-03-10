package _21_stategy._03_excercise;

import org.javatuples.Pair;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class Tests {
  @Test
  public void positiveTestOrdinaryStrategy() {
    DiscriminantStrategy strategy = new OrdinaryDiscriminantStrategy();
    QuadraticEquationSolver solver = new QuadraticEquationSolver(strategy);
    Pair<Complex, Complex> results = solver.solve(1, 10, 16);
    assertEquals(new Complex(-2, 0), results.getValue0());
    assertEquals(new Complex(-8, 0), results.getValue1());
  }

  @Test
  public void positiveTestRealStrategy() {
    DiscriminantStrategy strategy = new RealDiscriminantStrategy();
    QuadraticEquationSolver solver = new QuadraticEquationSolver(strategy);
    Pair<Complex, Complex> results = solver.solve(1, 10, 16);
    assertEquals(new Complex(-2, 0), results.getValue0());
    assertEquals(new Complex(-8, 0), results.getValue1());
  }

  @Test
  public void negativeTestOrdinaryStrategy() {
    OrdinaryDiscriminantStrategy strategy = new OrdinaryDiscriminantStrategy();
    QuadraticEquationSolver solver = new QuadraticEquationSolver(strategy);
    Pair<Complex, Complex> results = solver.solve(1, 4, 5);
    assertEquals(new Complex(-2, 1), results.getValue0());
    assertEquals(new Complex(-2, -1), results.getValue1());
  }

  @Test
  public void negativeTestRealStrategy() {
    DiscriminantStrategy strategy = new RealDiscriminantStrategy();
    QuadraticEquationSolver solver = new QuadraticEquationSolver(strategy);
    Pair<Complex, Complex> results = solver.solve(1, 4, 5);

    assertTrue(results.getValue0().isNaN());
    assertTrue(results.getValue1().isNaN());
  }
}