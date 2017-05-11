package NeuronalNetTest;

import NeuronalNet.ActivationFunctions.IActivationFunction;
import NeuronalNet.NeuralNetwork;
import NeuronalNet.NeuralNetworkFactory;
import NeuronalNet.TransferFunctions.ITransferFunction;


/**
 * Created by admin on 11.05.2017.
 */
public class SingleLayerTest {
    public static void main(String[] args) {

        NeuralNetwork nn = NeuralNetworkFactory.getNeuralNetworkFactory().createNeuralNetwork(4, IActivationFunction.ActivationSigmoid, ITransferFunction.TransferSum, 3, -1, 2, 0);
        System.out.println("ActivationFunction: Sigmoid; TransferFunction: Sum " + nn.getOutputNeurons().get(0).getValue());

        nn = NeuralNetworkFactory.getNeuralNetworkFactory().createNeuralNetwork(4, IActivationFunction.ActivationSigmoid, ITransferFunction.TransferMaximum , 3, -1, 2, 0);
        System.out.println("ActivationFunction: Sigmoid; TransferFunction: Maximum " + nn.getOutputNeurons().get(0).getValue());

        nn = NeuralNetworkFactory.getNeuralNetworkFactory().createNeuralNetwork(4, IActivationFunction.ActivationIdentity , ITransferFunction.TransferMinimum  , 3, -1, 2, 0);
        System.out.println("ActivationFunction: Identiy; TransferFunction: Minimum " + nn.getOutputNeurons().get(0).getValue());

        nn = NeuralNetworkFactory.getNeuralNetworkFactory().createNeuralNetwork(4, IActivationFunction.ActivationHyperBolicTangent , ITransferFunction.TransferMinimum, 3, -1, 2, 0);
        System.out.println("ActivationFunction: HyperBolicTangent; TransferFunction: Minimum " + nn.getOutputNeurons().get(0).getValue());

        nn = NeuralNetworkFactory.getNeuralNetworkFactory().createNeuralNetwork(4, IActivationFunction.ActivationHyperBolicTangent , ITransferFunction.TransferSum, 3, -1, 2, 0);
        System.out.println("ActivationFunction: Boolean; TransferFunction: Sum " + nn.getOutputNeurons().get(0).getValue());
    }
}
