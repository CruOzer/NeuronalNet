package NeuronalNet;

/**
 * Created by admin on 11.05.2017.
 */
public class InputNeuron extends Neuron {

    private float value;

    /**
     * Berechnet den Output des Neutrons. Der Output bei den Inputneuronen ist gleich dem Netzinput, da diese keine
     * Funktionen haben
     *
     * @return Output des Neutrons
     */
    @Override
    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    /**
     * Berechnet aus den Verbindungen den Netzinput des Neutrons. Dieser ist gleich dem Input des Neurons
     *
     * @return Netzinput des Neutrons
     */
    @Override
    public float getNetzInput() {
        return getValue();
    }
}
