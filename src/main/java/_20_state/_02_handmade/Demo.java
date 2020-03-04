package _20_state._02_handmade;

import org.javatuples.Pair;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Demo {

  public static void main(String[] args) {
    final BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    do {
      System.out.println("The phone is currently " + Manager.currentState);
      System.out.println("Select a trigger:");

      final List<Pair<Trigger, State>> rules = Manager.getAvailableTransitions();

      for (int i = 0; i < rules.size(); i++) {
        final Trigger trigger = rules.get(i).getValue0();
        System.out.printf("%d. %s\n", i, trigger);
      }

      boolean parseOk;
      int choice = 0;
      do {
        try {
          System.out.println("Please enter your choice:");
          choice = Integer.parseInt(console.readLine());
          parseOk = choice >= 0 && choice < rules.size();
        } catch (Exception e) {
          parseOk = false;
        }
      } while (!parseOk);

      Manager.currentState = Manager.getAvailableTransitions().get(choice).getValue1();
    } while (Manager.currentState != Manager.EXIT_STATE);
    System.out.println("And we are done!");
  }
}
