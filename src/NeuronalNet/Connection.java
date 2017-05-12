package NeuronalNet;

/**
 * Created by admin on 11.05.2017.
 */
public class Connection {

    private Neuron neuron;
    private float weight;

    /**
     * Konstruktor einer Verbindung. In der Verbindung wird gespeichert, welche Gewichtung diese hat und von welchem
     * Neuron sie wegführt.
     *
     * @param neuron Neuron, von dem die Verbindung wegführt
     * @param weight Gewichtung der Verbindung
     */
    public Connection(Neuron neuron, float weight) {
        this.neuron = neuron;
        this.weight = weight;
    }

    /**
     * Holt das Gewicht der Verbindung
     *
     * @return Gewicht der Verbindung
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Setzt das Gewicht der Verbindung
     *
     * @param weight Gewicht der Verbindung
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * Ermittelt den Wert, den diese Verbindung übermittelt, anhand des Wertes des Neurons und der Gewichtung
     *
     * @return Endwert der Verbindung
     */
    public float getValue() {
        return this.neuron.getValue() * weight;
    }
}
