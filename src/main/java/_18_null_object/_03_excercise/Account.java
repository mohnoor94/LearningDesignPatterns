package _18_null_object._03_excercise;

public class Account {
  private Log log;

  public Account(Log log) {
    this.log = log;
  }

  public void someOperation() throws Exception {
    int c = log.getRecordCount();
    log.logInfo("Performing an operation");
    if (c + 1 != log.getRecordCount())
      throw new Exception();
    if (log.getRecordCount() >= log.getRecordLimit())
      throw new Exception();
  }
}