package _18_null_object._03_excercise;

// In this example, we have a class `Account` that is very tightly coupled to a `Log`... it also breaks SRP by
// performing all sorts of weird checks in `someOperation()`.

// Your mission, should you choose to accept it, is to implement a `NullLog` class that can be fed into an `Account` and
// that doesn't throw any exceptions.

// Initial Code:

/*
interface Log
{
  // max # of elements in the log
  int getRecordLimit();

  // number of elements already in the log
  int getRecordCount();

  // expected to increment record count
  void logInfo(String message);
}

class Account
{
  private Log log;

  public Account(Log log)
  {
    this.log = log;
  }

  public void someOperation() throws Exception
  {
    int c = log.getRecordCount();
    log.logInfo("Performing an operation");
    if (c+1 != log.getRecordCount())
      throw new Exception();
    if (log.getRecordCount() >= log.getRecordLimit())
      throw new Exception();
  }
}

class NullLog implements Log
{
    // ...
}
 */