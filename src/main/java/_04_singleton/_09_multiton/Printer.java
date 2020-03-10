package _04_singleton._09_multiton;

import java.util.HashMap;

// Multi-ton Printer, you only have (at most) 3 instances of this Printer, with lazy loading
class Printer {
  private static int instanceCount = 0;

  private Printer() {
    // logging debugging info
    instanceCount++;
    System.out.println("A total of " + instanceCount + " instances created so far.");
  }

  private static HashMap<Subsystem, Printer> instances = new HashMap<>();

  public static Printer get(Subsystem subsystem) {
    if (instances.containsKey(subsystem)) return instances.get(subsystem);

    // lazy loading!
    Printer instance = new Printer();
    instances.put(subsystem, instance);
    return instance;
  }
}