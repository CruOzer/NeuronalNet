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

        NeuralNetwork nn = NeuralNetworkFactory.createNeuralNetwork(4, 1, IActivationFunction.ActivationSigmoid, ITransferFunction.TransferSum, 3, -1, 2, 0);
        System.out.println("ActivationFunction: Sigmoid; TransferFunction: Sum " + nn.getOutputNeurons().get(0).getValue());

        nn = NeuralNetworkFactory.createNeuralNetwork(4, 1, IActivationFunction.ActivationSigmoid, ITransferFunction.TransferMaximum, 3, -1, 2, 0);
        System.out.println("ActivationFunction: Sigmoid; TransferFunction: Maximum " + nn.getOutputNeurons().get(0).getValue());


        nn = NeuralNetworkFactory.createNeuralNetwork(4, 1, IActivationFunction.ActivationIdentity, ITransferFunction.TransferMinimum, 3, -1, 2, 0);
        System.out.println("ActivationFunction: Identiy; TransferFunction: Minimum " + nn.getOutputNeurons().get(0).getValue());

        nn = NeuralNetworkFactory.createNeuralNetwork(4, 1, IActivationFunction.ActivationHyperBolicTangent, ITransferFunction.TransferMinimum, 3, -1, 2, 0);
        System.out.println("ActivationFunction: HyperBolicTangent; TransferFunction: Minimum " + nn.getOutputNeurons().get(0).getValue());

        nn = NeuralNetworkFactory.createNeuralNetwork(4, 1, IActivationFunction.ActivationHyperBolicTangent, ITransferFunction.TransferSum, 3, -1, 2, 0);
        System.out.println("ActivationFunction: Boolean; TransferFunction: Sum " + nn.getOutputNeurons().get(0).getValue());

        nn = NeuralNetworkFactory.createNeuralNetwork(4, 1, IActivationFunction.ActivationIdentity, ITransferFunction.TransferSum, 3, -1, 2, 0);
        System.out.println("ActivationFunction: Identiy; TransferFunction: Sum " + nn.getOutputNeurons().get(0).getValue());


        nn = NeuralNetworkFactory.createNeuralNetwork(3, 1, IActivationFunction.ActivationIdentity, ITransferFunction.TransferSum, 0.3f, 1, 2);
        NeuralNetworkFactory.initializeInputNeurons(nn, 1, 0.5f, 0.4f);
        System.out.println("ActivationFunction: Identiy; TransferFunction: Sum " + nn.getOutputNeurons().get(0).getValue());


        nn.backPropagation(1f, 2f, 0, 0.5001f);

        NeuralNetwork n2 = NeuralNetworkFactory.createNeuralNetwork(3, 2, IActivationFunction.ActivationIdentity, ITransferFunction.TransferSum, 0.3f, 1, 2, 0.5836879f, 1.141844f, 2.113475f);
        NeuralNetworkFactory.initializeInputNeurons(n2, 1, 0.5f, 0.4f);
        System.out.println("ActivationFunction: Identiy; TransferFunction: Sum " + n2.getOutputNeurons().get(0).getValue());
        System.out.println("ActivationFunction: Identiy; TransferFunction: Sum " + n2.getOutputNeurons().get(1).getValue());
        n2.backPropagation(0.5f, 2f, 0, 0.000000001f);
        System.out.println("ActivationFunction: Identiy; TransferFunction: Sum " + n2.getOutputNeurons().get(1).getValue());


        NeuralNetwork n3 = NeuralNetworkFactory.createNeuralNetwork(3, 2, IActivationFunction.ActivationSigmoid, ITransferFunction.TransferSum, 0.3f, 0.8f, 0.5f, -0.2f, -0.6f, 0.7f);
        NeuralNetworkFactory.initializeInputNeurons(n3, 1, 0.7f, 0.6f);
        System.out.println("ActivationFunction: Identiy; TransferFunction: Sum " + n3.getOutputNeurons().get(0).getValue());
        System.out.println("ActivationFunction: Identiy; TransferFunction: Sum " + n3.getOutputNeurons().get(1).getValue());
        n3.backPropagation(0.5f, 0.8f, 1, 0.1f);
        n3.backPropagation(0.5f, 0.9f, 0, 0.1f);
        System.out.println("ActivationFunction: Identiy; TransferFunction: Sum " + n3.getOutputNeurons().get(1).getValue());
    }
}
