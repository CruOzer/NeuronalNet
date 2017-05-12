package NeuronalNet.TransferFunctions;

import NeuronalNet.Connection;

import java.util.List;

/**
 * Created by admin on 11.05.2017.
 */
public class MaximumFunction implements ITransferFunction {
    /**
     * Sucht das Maximum aller Werte einer Connection
     *
     * @param conns Alle Connections eines Neurpns
     * @return Sucht das Maxnimum aller Werte einer Connection
     */
    @Override
    public float transfer(List<Connection> conns) {
        float max;
        max = conns.get(0).getValue();
        for (Connection c : conns) {
            if (c.getValue() > max)
                max = c.getValue();
        }
        return max;
    }

}
