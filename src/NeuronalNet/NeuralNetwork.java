package NeuronalNet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 11.05.2017.
 */
public class NeuralNetwork {

    private List<InputNeuron> inputNeurons = new ArrayList<>();
    private List<WorkingNeuron> outputNeurons = new ArrayList<>();

    /**
     * Holt sich alle Inputneuronen des neuronalen Netzes
     *
     * @return Liste aller Inputneuronen
     */
    public List<InputNeuron> getInputNeurons() {
        return inputNeurons;
    }

    /**
     * Holt sich alle Outputneuronen des neuronalen Netzes
     *
     * @return Liste aller Outputneuronen
     */
    public List<WorkingNeuron> getOutputNeurons() {
        return outputNeurons;
    }

    /**
     * Vernetzt alle Workingneuronen mit Inputneuronen mit der Gewichtung 0
     */
    public void createFullMesh() {
        for (WorkingNeuron wn : outputNeurons) {
            for (InputNeuron in : inputNeurons) {
                wn.addConnection(new Connection(in, 0));
            }
        }
    }

    /**
     * Verbindet alle Workingneuronen mit den Inputneuronen mit der Gewichtung der übergebenen Werte
     *
     * @param weights Gewichtung der Verbindungen
     */
    public void createFullMesh(float... weights) {
        if (weights.length != inputNeurons.size() * outputNeurons.size())
            throw new RuntimeException();
        int index = 0;
        for (WorkingNeuron wn : outputNeurons) {
            for (InputNeuron in : inputNeurons) {
                wn.addConnection(new Connection(in, weights[index++]));
            }
        }
    }

    public void setInputNeuronValue(int index, float value) {
        inputNeurons.get(index).setValue(value);
    }

    /**
     * Führt die BackPropagation auf dem neuronalen Netz aus. Hierbei versucht die Gewichte so zu ändern, dass ein Ziel-
     * wert erreicht wird. Der Lernfaktor bestimmt die Lerngeschwindigkeit des neuronalen Netzes
     * Wij = E * di * aj
     * E: Lernfaktor
     * di:  f'(netzinputi) * (zieli - starti) für Output-Neutronen
     * aj: Aktivierungslevel des Inputlayers
     *
     * @param lernFaktor      Stellt die Lerngeschwindigkeit dar. Er sollte zwischen 0 und 1 liegen. Wobei 0 und 1 keine
     *                        zielführenden Werte sind. In der Praxis werden kleine Werte genommen, damit das Netz viel lernt
     * @param ziel            Zielwert, den die Outputneuronen erreichen sollen
     * @param outputIndex     Der Outputindex beschreibt welcher Output neu berechnet werden soll
     * @param abweichungsWert Bestimmt den Toleranzwert, den das Ergebnis vom Ziel abweichen darf
     */
    public void backPropagation(float lernFaktor, float ziel, int outputIndex, float abweichungsWert) {
        if (outputIndex + 1 > outputNeurons.size())
            throw new RuntimeException();
        float output;

        do {

            // j entspricht den Vorlayer
            // i entspricht diesem Layer
            // Wij = E * di * aj
            // E: Lernfaktor
            // di:  f'(netzinput) * (ziel - start) für Output-Neutronen
            // aj: Aktivierungslevel des Inputlayers
            // Berechnung Lernfakto * delta

            // berechnen von E * di
            float deltaW = lernFaktor * this.getOutputNeurons().get(outputIndex).berechneDelta(ziel);

            int index = 0;
            for (Connection c : this.getOutputNeurons().get(outputIndex).getConnections()) {
                // multiplizieren des Ergebnisses von E * di mit jeden aj der Inputneutronen
                // diese werden hinzuaddiert
                c.setWeight(c.getWeight() + deltaW * this.getInputNeurons().get(index++).getValue());
                System.out.println("Weigt of index " + index + ": " + c.getWeight());
            }
            output = this.getOutputNeurons().get(outputIndex).getValue();
            System.out.println("New value of output " + (outputIndex + 1) + ": " + output);
        } while (Math.abs(output - ziel) > abweichungsWert);
    }
}
