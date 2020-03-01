package _18_null_object._03_excercise;

public class NullLog implements Log {
  private static int count = 0;

  @Override
  public int getRecordLimit() {
    return Integer.MAX_VALUE;
  }

  @Override
  public int getRecordCount() {
    return count++;
  }

  @Override
  public void logInfo(String message) {
  }
}
