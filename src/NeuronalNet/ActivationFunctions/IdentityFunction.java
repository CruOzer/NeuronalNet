package NeuronalNet.ActivationFunctions;

/**
 * Created by admin on 11.05.2017.
 */
public class IdentityFunction implements IActivationFunction {

    @Override
    public float activation(float input) {
        return input;
    }

}
