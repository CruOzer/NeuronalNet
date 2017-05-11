package NeuronalNetTest;

import NeuronalNet.ActivationFunctions.IActivationFunction;
import NeuronalNet.Connection;
import NeuronalNet.NeuralNetwork;
import NeuronalNet.NeuralNetworkFactory;
import NeuronalNet.TransferFunctions.ITransferFunction;


/**
 * Created by admin on 11.05.2017.
 */
public class SingleLayerTest {
    public static void main(String[] args) {

        float lernFaktor = 0.5f;

        NeuralNetwork nn = NeuralNetworkFactory.getNeuralNetworkFactory().createNeuralNetwork(4, IActivationFunction.ActivationSigmoid, ITransferFunction.TransferSum, 3, -1, 2, 0);
        System.out.println("ActivationFunction: Sigmoid; TransferFunction: Sum " + nn.getOutputNeurons().get(0).getValue());

        nn = NeuralNetworkFactory.getNeuralNetworkFactory().createNeuralNetwork(4, IActivationFunction.ActivationSigmoid, ITransferFunction.TransferMaximum, 3, -1, 2, 0);
        System.out.println("ActivationFunction: Sigmoid; TransferFunction: Maximum " + nn.getOutputNeurons().get(0).getValue());

        nn = NeuralNetworkFactory.getNeuralNetworkFactory().createNeuralNetwork(4, IActivationFunction.ActivationIdentity, ITransferFunction.TransferMinimum, 3, -1, 2, 0);
        System.out.println("ActivationFunction: Identiy; TransferFunction: Minimum " + nn.getOutputNeurons().get(0).getValue());

        nn = NeuralNetworkFactory.getNeuralNetworkFactory().createNeuralNetwork(4, IActivationFunction.ActivationHyperBolicTangent, ITransferFunction.TransferMinimum, 3, -1, 2, 0);
        System.out.println("ActivationFunction: HyperBolicTangent; TransferFunction: Minimum " + nn.getOutputNeurons().get(0).getValue());

        nn = NeuralNetworkFactory.getNeuralNetworkFactory().createNeuralNetwork(4, IActivationFunction.ActivationHyperBolicTangent, ITransferFunction.TransferSum, 3, -1, 2, 0);
        System.out.println("ActivationFunction: Boolean; TransferFunction: Sum " + nn.getOutputNeurons().get(0).getValue());

        nn = NeuralNetworkFactory.getNeuralNetworkFactory().createNeuralNetwork(4, IActivationFunction.ActivationIdentity, ITransferFunction.TransferSum, 3, -1, 2, 0);
        System.out.println("ActivationFunction: Identiy; TransferFunction: Sum " + nn.getOutputNeurons().get(0).getValue());

        nn = NeuralNetworkFactory.getNeuralNetworkFactory().createNeuralNetwork(3, IActivationFunction.ActivationIdentity, ITransferFunction.TransferSum, 0.3f, 1, 2);
        NeuralNetworkFactory.getNeuralNetworkFactory().initializeInputNeurons(nn, 1, 0.5f, 0.4f);
        System.out.println("ActivationFunction: Identiy; TransferFunction: Sum " + nn.getOutputNeurons().get(0).getValue());
        float output = nn.getOutputNeurons().get(0).getValue();
        do {

            float ziel = 2f;
            float delta = lernFaktor * (ziel - output);
            int index = 0;
            for (Connection c : nn.getOutputNeurons().get(0).getConnections()) {
                c.setWeight(c.getWeight() + delta * nn.getInputNeurons().get(index++).getValue());
                System.out.println("Weigt of index " + index + ": " + c.getWeight());
            }
            output = nn.getOutputNeurons().get(0).getValue();
            System.out.println("ActivationFunction: Identiy; TransferFunction: Sum " + output);
            for (Connection c : nn.getOutputNeurons().get(0).getConnections()) {

            }
        } while (output < 2);
    }
}
