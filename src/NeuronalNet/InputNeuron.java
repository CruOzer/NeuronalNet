package NeuronalNet;

/**
 * Created by admin on 11.05.2017.
 */
public class InputNeuron extends Neuron {

    private float value;

    @Override
    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
