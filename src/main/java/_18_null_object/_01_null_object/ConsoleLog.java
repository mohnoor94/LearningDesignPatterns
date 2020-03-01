package _18_null_object._01_null_object;

public class ConsoleLog implements Log {
  @Override
  public void info(String msg) {
    System.out.println(">> " + msg);
  }

  @Override
  public void error(String msg) {
    System.out.println("Warning: " + msg);
  }
}
