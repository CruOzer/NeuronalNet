package NeuronalNetTest;

import NeuronalNet.ActivationFunctions.IActivationFunction;
import NeuronalNet.InputNeuron;
import NeuronalNet.NeuralNetwork;
import NeuronalNet.TransferFunctions.ITransferFunction;
import NeuronalNet.WorkingNeuron;

import  NeuronalNet.NeuralNetworkFactory;


/**
 * Created by admin on 11.05.2017.
 */
public class SingleLayerTest {
    public static void main(String[] args) {

        NeuralNetwork nn =NeuralNetworkFactory.getNeuralNetworkFactory().createNeuralNetwork(4, IActivationFunction.ActivationSigmoid  , ITransferFunction.TransferSum ,3,-1,2,0);
        System.out.println(nn.getOutputNeurons().get(0).getValue());
    }
}
