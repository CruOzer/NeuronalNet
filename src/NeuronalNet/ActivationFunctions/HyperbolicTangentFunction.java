package NeuronalNet.ActivationFunctions;

/**
 * Created by admin on 11.05.2017.
 */

public class HyperbolicTangentFunction implements IActivationFunction {

    /**
     * Ermittelt den Ausgabewert der  Aktivierungsfunktion
     *
     * @param input Wert für die Funktion
     * @return Wert der Aktivierungsfunktion
     */
    @Override
    public float activation(float input) {
        //(e^x-e^-x)/(e^x+e^-x)
        float epx = (float) Math.pow(Math.E, input);
        float enx = (float) Math.pow(Math.E, -input);
        return (epx - enx) / (epx + enx);
    }


    /**
     * Ermittelt den Ausgabewert der abgeleiteten Aktivierungsfunktion
     *
     * @param input Wert für die Funktion
     * @return Wert der abgeleiteten Aktivierungsfunktion
     */
    @Override
    public float activationAbleitung(float input) {
        //(4e^(2x))/((e^(2x)+1)^2)
        float e2x = (float) Math.pow(Math.E, 2 * input);

        return (4 * e2x) / ((float) Math.sqrt(e2x + 1));
    }
}
