package _07_composite._02_using_iterable.bad_implementation;

public class Demo {

    public static void main(String[] args) {
        Neuron neuron1 = new Neuron();
        Neuron neuron2 = new Neuron();

        NeuronLayer layer1 = new NeuronLayer();
        NeuronLayer layer2 = new NeuronLayer();

        neuron1.connectTo(neuron2);
        // neuron1.connectTo(layer1); // not implemented
        // layer1.connectTo(neuron1); // not implemented
        // layer1.connectTo(layer2); // not implemented

        // do not make since to implement 4 versions of 'connectTo' methods!
        // the problem will be bigger if you have a 3 elements in the hierarchy (you have to implement 3x3= 9 implementations)
        // and so on!
    }
}
