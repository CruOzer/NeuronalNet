package NeuronalNet;

import NeuronalNet.ActivationFunctions.IActivationFunction;
import NeuronalNet.TransferFunctions.ITransferFunction;

/**
 * Created by admin on 11.05.2017.
 */
public class NeuralNetworkFactory {

    private static NeuralNetworkFactory neuralNetFactory;

    public static NeuralNetworkFactory getNeuralNetworkFactory() {
        if (neuralNetFactory == null)
            neuralNetFactory = new NeuralNetworkFactory();
        return neuralNetFactory;
    }


    public static NeuralNetwork createNeuralNetwork(int inputNeurons, IActivationFunction activationFunction, ITransferFunction transferFunction, float... weights) {
        NeuralNetwork nn = new NeuralNetwork();

        for (int i = 0; i < inputNeurons; i++) {
            addNewInput(nn);
        }
        initializeInputNeurons(nn);

        addNewOutput(nn);
        for (WorkingNeuron neuron : nn.getOutputNeurons()) {
            neuron.setActivationFunction(activationFunction);
            neuron.setTransferFunction(transferFunction);

        }
        nn.createFullMesh(weights);
        return nn;
    }

    private static void addNewInput(NeuralNetwork nn) {
        InputNeuron in = new InputNeuron();
        nn.getInputNeurons().add(in);
    }

    private static void addNewOutput(NeuralNetwork nn) {
        WorkingNeuron on = new WorkingNeuron();
        nn.getOutputNeurons().add(on);
    }

    private static void initializeInputNeurons(NeuralNetwork nn) {
        for (int index = 0; index < nn.getInputNeurons().size(); index++) {
            nn.setInputNeuronValue(index, index + 1);
        }

    }

    public static void initializeInputNeurons(NeuralNetwork nn, float... input) {
        int index = 0;
        if (input.length != nn.getInputNeurons().size())
            throw new RuntimeException();
        for (float in : input) {
            nn.setInputNeuronValue(index++, in);
        }
    }
}
