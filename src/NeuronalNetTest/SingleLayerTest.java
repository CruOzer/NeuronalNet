package NeuronalNetTest;

import NeuronalNet.InputNeuron;
import NeuronalNet.NeuralNetwork;
import NeuronalNet.WorkingNeuron;

/**
 * Created by admin on 11.05.2017.
 */
public class SingleLayerTest {
    public static void main(String[] args) {

        NeuralNetwork nn = new NeuralNetwork();
        InputNeuron i1= nn.createNewInput();
        InputNeuron i2= nn.createNewInput();
        InputNeuron i3= nn.createNewInput();
        InputNeuron i4= nn.createNewInput();
        WorkingNeuron wn = nn.createNewOutput() ;
        nn.createFullMesh(3,-1,2,0);

        i1.setValue(1);
        i2.setValue(2);
        i3.setValue(3);
        i4.setValue(4);

        System.out.println(wn.getValue());

    }
}
