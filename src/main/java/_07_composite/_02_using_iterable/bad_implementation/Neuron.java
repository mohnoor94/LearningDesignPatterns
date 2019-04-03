package _07_composite._02_using_iterable.bad_implementation;

import java.util.ArrayList;
import java.util.List;

public class Neuron {

    private List<Neuron> in = new ArrayList<>();
    private List<Neuron> out = new ArrayList<>();

    public void connectTo(Neuron other) {
        out.add(other);
        other.getIn().add(this);
    }

    public List<Neuron> getIn() {
        return in;
    }

    public List<Neuron> getOut() {
        return out;
    }
}
