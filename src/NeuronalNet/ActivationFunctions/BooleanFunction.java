package NeuronalNet.ActivationFunctions;

/**
 * Created by admin on 11.05.2017.
 */
public class BooleanFunction implements IActivationFunction {

    @Override
    public float activation(float input) {
        if (input < 0) return 0;
        return 1;
    }
}
