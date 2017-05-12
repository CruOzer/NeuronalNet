package NeuronalNet;

import NeuronalNet.ActivationFunctions.IActivationFunction;
import NeuronalNet.TransferFunctions.ITransferFunction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 11.05.2017.
 */
public class WorkingNeuron extends Neuron {


    private List<Connection> connections = new ArrayList<>();
    private IActivationFunction activationFunction;
    private ITransferFunction transferFunction;

    /**
     * Gibt alle Verbindungen, die zum Neutron hinführen, zurück
     *
     * @return Alle Verbindungen des Neutrons
     */
    public List<Connection> getConnections() {
        return connections;
    }


    /**
     * Setzt die Aktivierungsfunktion des Neutrons
     *
     * @param activationFunction Aktivierungsfunktion des Neutrons (übers Interface)
     */
    public void setActivationFunction(IActivationFunction activationFunction) {
        this.activationFunction = activationFunction;
    }

    /**
     * Setzt die Übertragungsfunktion des Neutrons
     *
     * @param transferFunction Übertragungsfunktion des Neutrons (übers Interface)
     */
    public void setTransferFunction(ITransferFunction transferFunction) {
        this.transferFunction = transferFunction;
    }


    /**
     * Berechnet aus den Verbindungen den Netzinput des Neutronens mithilfe der Übertragungsfunktion
     *
     * @return Netzinput des Neutrons
     */
    public float getNetzInput() {
        return transferFunction.transfer(connections);
    }

    /**
     * Berechnet den Output des Neutrons, indem es sich den Netzinput holt und diesen in die Aktivierungsfunktion
     * einsetzt
     *
     * @return Output des Neutrons
     */
    @Override
    public float getValue() {
        return activationFunction.activation(getNetzInput());
    }

    /**
     * Fügt eine neue Verbindung, die zum Neutron führt, hinzu
     *
     * @param c Verbindung
     */
    public void addConnection(Connection c) {
        connections.add(c);
    }


    /**
     * Berechnet das Delta für das Neutrons, indem es den Netzinput in die Ableitungsfunktion einsetzt
     * und diese Wert mit der Differenz aus dem Zielwert und dem aktuellen multipliziert
     *
     * @param ziel Zielwert des Neutrons, der erreicht werden soll
     * @return delta des Neutrons
     */
    public float berechneDelta(float ziel) {
        return activationFunction.activationAbleitung(getNetzInput()) * (ziel - getValue());
    }
}
