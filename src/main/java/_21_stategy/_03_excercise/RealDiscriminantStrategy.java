package _21_stategy._03_excercise;

class RealDiscriminantStrategy implements DiscriminantStrategy {
  @Override
  public double calculateDiscriminant(double a, double b, double c) {
    final double ans = b * b - 4 * a * c;
    return ans < 0 ? Double.NaN : ans;
  }
}
