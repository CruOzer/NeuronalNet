package NeuronalNet.ActivationFunctions;

/**
 * Created by admin on 11.05.2017.
 */
public class BooleanFunction implements IActivationFunction {

    /**
     * Ermittelt den Ausgabewert der  Aktivierungsfunktion
     *
     * @param input Wert für die Funktion
     * @return Wert der Aktivierungsfunktion
     */
    @Override
    public float activation(float input) {
        if (input < 0) return 0;
        return 1;
    }

    /**
     * Ermittelt den Ausgabewert der abgeleiteten Aktivierungsfunktion
     *
     * @param input Wert für die Funktion
     * @return Wert der abgeleiteten Aktivierungsfunktion
     */
    @Override
    public float activationAbleitung(float input) {
        return 0;
    }
}
