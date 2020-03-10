package _21_stategy._03_excercise;

import java.util.Objects;

// complex number implementation taken from here:
// https://introcs.cs.princeton.edu/java/32class/Complex.java.html
class Complex {
  private final double real;   // the real part
  private final double imag;   // the imaginary part

  // create a new object with the given real and imaginary parts
  public Complex(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  // return a string representation of the invoking Complex object
  public String toString() {
    if (imag == 0) return real + "";
    if (real == 0) return imag + "i";
    if (imag < 0) return real + " - " + (-imag) + "i";
    return real + " + " + imag + "i";
  }

  // return abs/modulus/magnitude
  public double abs() {
    return Math.hypot(real, imag);
  }

  // return angle/phase/argument, normalized to be between -pi and pi
  public double phase() {
    return Math.atan2(imag, real);
  }

  // return a new Complex object whose value is (this + b)
  public Complex plus(Complex b) {
    Complex a = this;             // invoking object
    double real = a.real + b.real;
    double imag = a.imag + b.imag;
    return new Complex(real, imag);
  }

  // return a new Complex object whose value is (this - b)
  public Complex minus(Complex b) {
    Complex a = this;
    double real = a.real - b.real;
    double imag = a.imag - b.imag;
    return new Complex(real, imag);
  }

  // return a new Complex object whose value is (this * b)
  public Complex times(Complex b) {
    Complex a = this;
    double real = a.real * b.real - a.imag * b.imag;
    double imag = a.real * b.imag + a.imag * b.real;
    return new Complex(real, imag);
  }

  // return a new object whose value is (this * alpha)
  public Complex scale(double alpha) {
    return new Complex(alpha * real, alpha * imag);
  }

  // return a new Complex object whose value is the conjugate of this
  public Complex conjugate() {
    return new Complex(real, -imag);
  }

  // return a new Complex object whose value is the reciprocal of this
  public Complex reciprocal() {
    double scale = real * real + imag * imag;
    return new Complex(real / scale, -imag / scale);
  }

  // return the real or imaginary part
  public double re() {
    return real;
  }

  public double im() {
    return imag;
  }

  // return a / b
  public Complex divides(Complex b) {
    Complex a = this;
    return a.times(b.reciprocal());
  }

  // return a new Complex object whose value is the complex exponential of this
  public Complex exp() {
    return new Complex(Math.exp(real) * Math.cos(imag), Math.exp(real) * Math.sin(imag));
  }

  // return a new Complex object whose value is the complex sine of this
  public Complex sin() {
    return new Complex(Math.sin(real) * Math.cosh(imag), Math.cos(real) * Math.sinh(imag));
  }

  // return a new Complex object whose value is the complex cosine of this
  public Complex cos() {
    return new Complex(Math.cos(real) * Math.cosh(imag), -Math.sin(real) * Math.sinh(imag));
  }

  public static Complex sqrt(double value) {
    if (value < 0)
      return new Complex(0, Math.sqrt(-value));
    else
      return new Complex(Math.sqrt(value), 0);
  }

  // return a new Complex object whose value is the complex tangent of this
  public Complex tan() {
    return sin().divides(cos());
  }

  // a static version of plus
  public static Complex plus(Complex a, Complex b) {
    double real = a.real + b.real;
    double imag = a.imag + b.imag;
    return new Complex(real, imag);
  }

  // See Section 3.3.
  public boolean equals(Object x) {
    if (x == null) return false;
    if (this.getClass() != x.getClass()) return false;
    Complex that = (Complex) x;
    return (this.real == that.real) && (this.imag == that.imag);
  }

  // See Section 3.3.
  public int hashCode() {
    return Objects.hash(real, imag);
  }

  public boolean isNaN() {
    return Double.isNaN(real) || Double.isNaN(imag);
  }
}
