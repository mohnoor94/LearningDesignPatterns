package _07_composite._02_using_iterable.good_implementation;

public class Demo {

    public static void main(String[] args) {
        Neuron neuron1 = new Neuron();
        Neuron neuron2 = new Neuron();

        NeuronLayer layer1 = new NeuronLayer();
        NeuronLayer layer2 = new NeuronLayer();

        neuron1.connectTo(neuron2); // easy
        neuron1.connectTo(layer1);
        layer1.connectTo(neuron1);
        layer1.connectTo(layer2);

        // 1 implementation for all of the situations! wow!
    }
}
