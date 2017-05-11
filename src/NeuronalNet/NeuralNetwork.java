package NeuronalNet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 11.05.2017.
 */
public class NeuralNetwork {

    private List<InputNeuron> inputNeurons = new ArrayList<>();
    private List<WorkingNeuron> outputNeurons = new ArrayList<>();


    public InputNeuron createNewInput() {
        InputNeuron in = new InputNeuron();
        inputNeurons.add(in);
        return in;
    }


    public WorkingNeuron createNewOutput() {
        WorkingNeuron on = new WorkingNeuron();
        outputNeurons.add(on);
        return on;
    }


    public void createFullMesh() {
        for (WorkingNeuron wn : outputNeurons) {
            for (InputNeuron in : inputNeurons) {
                wn.addConnection(new Connection(in, 0));
            }
        }
    }


    public void createFullMesh(float... weights) {
        if (weights.length!=inputNeurons.size()*outputNeurons.size())
            throw new RuntimeException();
        int index = 0;
        for (WorkingNeuron wn : outputNeurons) {
            for (InputNeuron in : inputNeurons) {
                wn.addConnection(new Connection(in, weights[index++]));
            }
        }
    }
}
