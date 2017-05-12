package NeuronalNet.ActivationFunctions;

/**
 * Created by admin on 11.05.2017.
 */
public interface IActivationFunction {
    public static IActivationFunction ActivationBoolean = new BooleanFunction();
    public static IActivationFunction ActivationIdentity = new IdentityFunction();
    public static IActivationFunction ActivationSigmoid = new SigmoidFunction();
    public static IActivationFunction ActivationHyperBolicTangent = new HyperbolicTangentFunction();

    /**
     * Ermittelt den Ausgabewert der  Aktivierungsfunktion
     *
     * @param input Wert für die Funktion
     * @return Wert der Aktivierungsfunktion
     */
    public float activation(float input);

    /**
     * Ermittelt den Ausgabewert der abgeleiteten Aktivierungsfunktion
     *
     * @param input Wert für die Funktion
     * @return Wert der abgeleiteten Aktivierungsfunktion
     */
    public float activationAbleitung(float input);
}
