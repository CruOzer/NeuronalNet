package NeuronalNet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 11.05.2017.
 */
public class WorkingNeuron extends Neuron {


    private List<Connection> connections = new ArrayList<>();

    @Override
    public float getValue() {
        float sum = 0;
        for (Connection c : connections) {
            sum += c.getValue();
        }
        return sum;
    }

    public void addConnection(Connection c) {
        connections.add(c);
    }
}