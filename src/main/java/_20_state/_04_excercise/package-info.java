package _20_state._04_excercise;

// A combination lock is a lock that opens after the right digits have been entered. A lock is pre-programmed with a
// combination (e.g., 12345) and the user is expected to enter this combination to unlock the lock.

// The lock has a `status` field that indicates the state of the lock. The rules are:
// - If the lock has just been locked (or at startup), the status is LOCKED.
// - If a digit has been entered, that digit is shown on the screen. As the user enters more digits, they are added to `status`.
// - If the user has entered the correct sequence of digits, the lock status changes to OPEN.
// - If the user enters an incorrect sequence of digits, the lock status changes to ERROR.

// Please implement the `CombinationLock` class to enable this behavior. Be sure to test both correct and incorrect inputs.

// Initial Code:

/*
class CombinationLock
{
  private int [] combination;
  public String status;

  public CombinationLock(int[] combination)
  {
    this.combination = combination;
  }

  public void enterDigit(int digit)
  {
    // ...
  }
}
 */