package NeuronalNet;

import NeuronalNet.ActivationFunctions.BooleanFunction;
import NeuronalNet.ActivationFunctions.IActivationFunction;
import NeuronalNet.ActivationFunctions.IdentityFunction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 11.05.2017.
 */
public class WorkingNeuron extends Neuron {


    private List<Connection> connections = new ArrayList<>();
    private IActivationFunction activationFunction= IActivationFunction.ActivationSigmoid   ;

    @Override
    public float getValue() {
        float sum = 0;
        for (Connection c : connections) {
            sum += c.getValue();
        }
        return activationFunction.activation(sum);
    }

    public void addConnection(Connection c) {
        connections.add(c);
    }
}
