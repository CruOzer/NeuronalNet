package NeuronalNet.TransferFunctions;

import NeuronalNet.Connection;

import java.util.List;

/**
 * Created by admin on 11.05.2017.
 */
public interface ITransferFunction {


    public static ITransferFunction TransferSum = new SumFunction();
    public static ITransferFunction TransferMaximum = new MaximumFunction();
    public static ITransferFunction TransferMinimum = new MinimumFunction();

    /**
     * Bildet aus allen eingehenden Werten eines Neurons mit Hilfer der Übertragungsfunktion einen Wert
     *
     * @param conns Alle Connections eines Neurpns
     * @return Ermittelter Wert der Übertragungsfunktion dieser Connections
     */
    float transfer(List<Connection> conns);
}
