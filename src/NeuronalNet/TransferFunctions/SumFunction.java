package NeuronalNet.TransferFunctions;

import NeuronalNet.Connection;

import java.util.List;

/**
 * Created by admin on 11.05.2017.
 */
public class SumFunction implements ITransferFunction {
    @Override
    public float transfer(List<Connection> conns) {
        float sum = 0;
        for (Connection c : conns) {
            sum += c.getValue();
        }
        return sum;
    }
}
