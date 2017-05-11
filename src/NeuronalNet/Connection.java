package NeuronalNet;

/**
 * Created by admin on 11.05.2017.
 */
public class Connection {

    private Neuron neuron;
    private float weight;

    public Connection(Neuron neuron, float weight) {
        this.neuron = neuron;
        this.weight = weight;
    }

    public float getValue() {
        return this.neuron.getValue() * weight;
    }
}
