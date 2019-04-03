package _07_composite._02_using_iterable.good_implementation;

import java.util.*;
import java.util.function.Consumer;

// You can implement Iterable<T> even on a single element!
public class Neuron implements SomeNeurons {

    private List<Neuron> in = new ArrayList<>();
    private List<Neuron> out = new ArrayList<>();

    public List<Neuron> getIn() {
        return in;
    }

    public List<Neuron> getOut() {
        return out;
    }

    public Iterator<Neuron> iterator() {
        return Collections.singleton(this).iterator();
    }

    @Override
    public void forEach(Consumer<? super Neuron> action) {
        action.accept(this);
    }

    @Override
    public Spliterator<Neuron> spliterator() {
        return Collections.singleton(this).spliterator();
    }
}
