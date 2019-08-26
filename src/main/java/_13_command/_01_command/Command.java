package _13_command._01_command;

// very abstract and general interface
public interface Command {
    void call();
    void undo();
}
