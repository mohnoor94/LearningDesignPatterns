package _20_state._03_spring_statemachine;

import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.state.State;
import org.springframework.statemachine.transition.Transition;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class SpringStatemachineDemo {

  // requires org.springframework.statemachine
  public static void main(String[] args) throws Exception {
    StateMachine<States, Events> machine = Manager.buildMachine();
    machine.start();

    States exitState = States.ON_HOOK;
    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    do {
      State<States, Events> state = machine.getState();

      System.out.println("The phone is currently " + state.getId());
      System.out.println("Select a trigger:");

      List<Transition<States, Events>> ts = machine.getTransitions()
              .stream()
              .filter(t -> t.getSource() == state)
              .collect(Collectors.toList());
      for (int i = 0; i < ts.size(); ++i) {
        System.out.println("" + i + ". " + ts.get(i).getTrigger().getEvent());
      }

      boolean parseOK;
      int choice = 0;
      do {
        try {
          System.out.println("Please enter your choice:");

          choice = Integer.parseInt(console.readLine());
          parseOK = choice >= 0 && choice < ts.size();
        } catch (Exception e) {
          parseOK = false;
        }
      } while (!parseOK);

      // perform the transition
      machine.sendEvent(ts.get(choice).getTrigger().getEvent());
    } while (machine.getState().getId() != exitState);
    System.out.println("And we are done!");
  }
}
