package NeuronalNet;

/**
 * Created by admin on 11.05.2017.
 */
public interface INeuron {
    /**
     * Berechnet den Output des Neutrons
     *
     * @return Output des Neutrons
     */
    float getValue();

    /**
     * Berechnet aus den Verbindungen den Netzinput des Neutrons
     *
     * @return Netzinput des Neutrons
     */
    float getNetzInput();
}
