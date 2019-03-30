package _06_bridge._03_excercise;

// Bridge Coding Exercise

// You are given an example of an inheritance hierarchy which results in Cartesian-product duplication.
// Please refactor this hierarchy, giving the base class Shape a constructor that takes an interface called
// Renderer defined as

/*
    interface Renderer {
        String whatToRenderAs();
    }
 */

// as well as VectorRenderer and RasterRenderer classes.
// Each implementer of the Shape interface should have a constructor that takes an Renderer such that, subsequently,
// each constructed object's toString() operates correctly and produces a message similar to the following:
// new Triangle(new RasterRenderer()).toString() // returns "Drawing Triangle as pixels"
// The method whatToRenderAs() should return 'pixels' if using a raster renderer, and 'lines' if using a vector renderer.

// Code to refactor:

/*
abstract class Shape
{
  public abstract String getName();
}

class Triangle extends Shape
{
  @Override
  public String getName()
  {
    return "Triangle";
  }
}

class Square extends Shape
{
  @Override
  public String getName()
  {
    return "Square";
  }
}

class VectorSquare extends Square
{
  @Override
  public String toString()
  {
    return String.format("Drawing %s as lines", getName());
  }
}

class RasterSquare extends Square
{
  @Override
  public String toString()
  {
    return String.format("Drawing %s as pixels", getName());
  }
}

// imagine VectorTriangle and RasterTriangle are here too
 */