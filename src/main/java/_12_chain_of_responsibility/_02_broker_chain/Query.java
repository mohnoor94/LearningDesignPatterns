package _12_chain_of_responsibility._02_broker_chain;

public class Query {
    public enum Argument {ATTACK, DEFENSE}
    private String creatureName;
    private Argument argument;
    private int result;

    public Query(String creatureName, Argument argument, int result) {
        this.creatureName = creatureName;
        this.argument = argument;
        this.result = result;
    }

    public String getCreatureName() {
        return creatureName;
    }

    public Argument getArgument() {
        return argument;
    }

    public void setArgument(Argument argument) {
        this.argument = argument;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
