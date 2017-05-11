package NeuronalNet.TransferFunctions;

import NeuronalNet.Connection;

import java.util.List;

/**
 * Created by admin on 11.05.2017.
 */
public class MinimumFunction implements ITransferFunction {
    @Override
    public float transfer(List<Connection> conns) {
        float min;
        min = conns.get(0).getValue();
        for (Connection c : conns) {
            if (c.getValue() < min)
                min = c.getValue();
        }
        return min;
    }
}
