package NeuronalNet;

import NeuronalNet.ActivationFunctions.IActivationFunction;
import NeuronalNet.TransferFunctions.ITransferFunction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 11.05.2017.
 */
public class WorkingNeuron extends Neuron {


    private List<Connection> connections = new ArrayList<>();
    private IActivationFunction activationFunction;
    private ITransferFunction transferFunction;

    public List<Connection> getConnections() {
        return connections;
    }

    public void setActivationFunction(IActivationFunction activationFunction) {
        this.activationFunction = activationFunction;
    }

    public void setTransferFunction(ITransferFunction transferFunction) {
        this.transferFunction = transferFunction;
    }

    @Override
    public float getValue() {
        return activationFunction.activation(transferFunction.transfer(connections));
    }

    public void addConnection(Connection c) {
        connections.add(c);
    }
}
