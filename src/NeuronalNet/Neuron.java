package NeuronalNet;

/**
 * Created by admin on 11.05.2017.
 */
public abstract class Neuron implements INeuron {
    /**
     * Berechnet den Output des Neutrons
     *
     * @return Output des Neutrons
     */
    public abstract float getValue();

    /**
     * Berechnet aus den Verbindungen den Netzinput des Neutronens
     *
     * @return Netzinput des Neutrons
     */
    public abstract float getNetzInput();
}
