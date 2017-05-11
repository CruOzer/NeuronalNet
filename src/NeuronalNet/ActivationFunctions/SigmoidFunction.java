package NeuronalNet.ActivationFunctions;

/**
 * Created by admin on 11.05.2017.
 */
public class SigmoidFunction implements IActivationFunction {

    @Override
    public float activation(float input) {
        return (float) (1f / (1f + Math.pow(Math.E, -input)));
    }
}
