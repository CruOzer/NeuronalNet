package NeuronalNet.ActivationFunctions;

/**
 * Created by admin on 11.05.2017.
 */
public class SigmoidFunction implements IActivationFunction {

    /**
     * Ermittelt den Ausgabewert der  Aktivierungsfunktion
     *
     * @param input Wert für die Funktion
     * @return Wert der Aktivierungsfunktion
     */
    @Override
    public float activation(float input) {
        return (float) (1f / (1f + Math.pow(Math.E, -input)));
    }

    /**
     * Ermittelt den Ausgabewert der abgeleiteten Aktivierungsfunktion
     *
     * @param input Wert für die Funktion
     * @return Wert der abgeleiteten Aktivierungsfunktion
     */
    @Override
    public float activationAbleitung(float input) {
        return activation(input) * (1 - activation(input));
    }
}
