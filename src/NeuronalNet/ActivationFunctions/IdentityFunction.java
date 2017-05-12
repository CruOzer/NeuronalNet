package NeuronalNet.ActivationFunctions;

/**
 * Created by admin on 11.05.2017.
 */
public class IdentityFunction implements IActivationFunction {
    /**
     * Ermittelt den Ausgabewert der  Aktivierungsfunktion
     *
     * @param input Wert für die Funktion
     * @return Wert der Aktivierungsfunktion
     */
    @Override
    public float activation(float input) {
        return input;
    }

    /**
     * Ermittelt den Ausgabewert der abgeleiteten Aktivierungsfunktion
     *
     * @param input Wert für die Funktion
     * @return Wert der abgeleiteten Aktivierungsfunktion
     */
    @Override
    public float activationAbleitung(float input) {
        return 1;
    }


}
