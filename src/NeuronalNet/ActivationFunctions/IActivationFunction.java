package NeuronalNet.ActivationFunctions;

/**
 * Created by admin on 11.05.2017.
 */
public interface IActivationFunction {
    public static IActivationFunction ActivationBoolean = new BooleanFunction();
    public static IActivationFunction ActivationIdentity = new IdentityFunction();
    public static IActivationFunction ActivationSigmoid = new SigmoidFunction();
    public static IActivationFunction ActivationHyperBolicTangent = new HyperbolicTangentFunction();

    public float activation(float input);
}
