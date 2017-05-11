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

    float transfer(List<Connection> conns);
}
