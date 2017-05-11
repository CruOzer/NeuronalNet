package NeuronalNet.ActivationFunctions;

/**
 * Created by admin on 11.05.2017.
 */
public class HyperbolicTangentFunction implements IActivationFunction {
    @Override
    public float activation(float input) {
        float epx = (float) Math.pow(Math.E, input);
        float enx = (float) Math.pow(Math.E, -input);
        return (epx - enx) / (epx + enx);
    }
}
