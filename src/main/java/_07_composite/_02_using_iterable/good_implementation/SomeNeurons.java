package _07_composite._02_using_iterable.good_implementation;

public interface SomeNeurons extends Iterable<Neuron> {

    default void connectTo(SomeNeurons other) {
        if (this == other) return;

        this.forEach(from -> other.forEach(to -> {
            from.getOut().add(to);
            to.getIn().add(from);
        }));
    }
}
