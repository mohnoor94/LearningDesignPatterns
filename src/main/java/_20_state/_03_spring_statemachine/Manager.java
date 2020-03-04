package _20_state._03_spring_statemachine;

import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineBuilder;

import java.util.EnumSet;

public class Manager {

  public static StateMachine<States, Events> buildMachine() throws Exception {
    StateMachineBuilder.Builder<States, Events> builder = StateMachineBuilder.builder();

    builder.configureStates()
            .withStates()
            .initial(States.OFF_HOOK)
            .states(EnumSet.allOf(States.class));

    builder.configureTransitions()
            .withExternal()
            .source(States.OFF_HOOK)
            .event(Events.CALL_DIALED)
            .target(States.CONNECTING)

            .and()
            .withExternal()
            .source(States.OFF_HOOK)
            .event(Events.STOP_USING_PHONE)
            .target(States.ON_HOOK)

            .and()
            .withExternal()
            .source(States.CONNECTING)
            .event(Events.HUNG_UP)
            .target(States.OFF_HOOK)

            .and()
            .withExternal()
            .source(States.CONNECTING)
            .event(Events.CALL_CONNECTED)
            .target(States.CONNECTED)

            .and()
            .withExternal()
            .source(States.CONNECTED)
            .event(Events.LEFT_MESSAGE)
            .target(States.OFF_HOOK)

            .and()
            .withExternal()
            .source(States.CONNECTED)
            .event(Events.HUNG_UP)
            .target(States.OFF_HOOK)

            .and()
            .withExternal()
            .source(States.CONNECTED)
            .event(Events.PLACED_ON_HOLD)
            .target(States.OFF_HOOK)

            .and()
            .withExternal()
            .source(States.ON_HOLD)
            .event(Events.TAKEN_OFF_HOLD)
            .target(States.CONNECTED)

            .and()
            .withExternal()
            .source(States.ON_HOLD)
            .event(Events.HUNG_UP)
            .target(States.OFF_HOOK);

    return builder.build();
  }
}
