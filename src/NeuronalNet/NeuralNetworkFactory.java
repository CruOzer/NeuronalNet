package NeuronalNet;

import NeuronalNet.ActivationFunctions.IActivationFunction;
import NeuronalNet.TransferFunctions.ITransferFunction;

/**
 * Created by admin on 11.05.2017.
 */
public class NeuralNetworkFactory {

    private static NeuralNetworkFactory neuralNetFactory;

    /**
     * Holt die Fabrik, die Neuronale Netze erstellt
     *
     * @return Fabrik
     */
    public static NeuralNetworkFactory getNeuralNetworkFactory() {
        if (neuralNetFactory == null)
            neuralNetFactory = new NeuralNetworkFactory();
        return neuralNetFactory;
    }


    /**
     * Kreirt ein Neuronales Netz mit den übergebenen Funktionen, Gewichten und einem FullMesh
     *
     * @param inputNeurons       Anzahl der Input Neuronen
     * @param activationFunction Aktivierungsfunktion der arbeitenden Neuronen
     * @param transferFunction   Übertragungsfunktion der arbeitenden Neuronen
     * @param weights            Gewichte der Verbindungen
     * @return Neuronale Netz
     */
    public static NeuralNetwork createNeuralNetwork(int inputNeurons, int outputNeurons, IActivationFunction activationFunction, ITransferFunction transferFunction, float... weights) {
        NeuralNetwork nn = new NeuralNetwork();

        for (int i = 0; i < inputNeurons; i++) {
            addNewInput(nn);
        }
        initializeInputNeurons(nn);

        for (int i = 0; i < outputNeurons; i++) {
            addNewOutput(nn);
        }

        for (WorkingNeuron neuron : nn.getOutputNeurons()) {
            neuron.setActivationFunction(activationFunction);
            neuron.setTransferFunction(transferFunction);
        }
        nn.createFullMesh(weights);
        return nn;
    }


    /**
     * Fügt dem Neuronalen Netz ein Input Neuron hinzu
     *
     * @param nn Neuronale Netz
     */
    private static void addNewInput(NeuralNetwork nn) {
        InputNeuron in = new InputNeuron();
        nn.getInputNeurons().add(in);
    }

    /**
     * Fügt dem Neuronalen Netz ein Output Neuron hinzu
     *
     * @param nn Neuronale Netz
     */
    private static void addNewOutput(NeuralNetwork nn) {
        WorkingNeuron on = new WorkingNeuron();
        nn.getOutputNeurons().add(on);
    }

    /**
     * Initialisiert die Inputneuronen des übergebenen Neuronalen Netzes mit inkrementierten Standardwerten
     *
     * @param nn Neuronale Netz
     */
    private static void initializeInputNeurons(NeuralNetwork nn) {
        for (int index = 0; index < nn.getInputNeurons().size(); index++) {
            nn.setInputNeuronValue(index, index + 1);
        }

    }

    /**
     * Initialisiert die Inputneuronen des übergebenen Neuronalen Netzes
     *
     * @param nn    Neuronale Netz
     * @param input Aktivierungsleven der InputNeuronen
     */
    public static void initializeInputNeurons(NeuralNetwork nn, float... input) {
        int index = 0;
        if (input.length != nn.getInputNeurons().size())
            throw new RuntimeException();
        for (float in : input) {
            nn.setInputNeuronValue(index++, in);
        }
    }
}
