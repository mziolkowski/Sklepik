package sample.model;
/**
 * Create by: maciejziolkowski on 05 gru 2017
 */

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Transport {
    private IntegerProperty id_transport;
    private StringProperty nazwa;
    private StringProperty rodzaj;

    public Transport() {
        this.id_transport = new SimpleIntegerProperty();
        this.nazwa = new SimpleStringProperty();
        this.rodzaj = new SimpleStringProperty();
    }

    public int getId_transport() {
        return id_transport.get();
    }

    public IntegerProperty id_transportProperty() {
        return id_transport;
    }

    public void setId_transport(int id_transport) {
        this.id_transport.set(id_transport);
    }

    public String getNazwa() {
        return nazwa.get();
    }

    public StringProperty nazwaProperty() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa.set(nazwa);
    }

    public String getRodzaj() {
        return rodzaj.get();
    }

    public StringProperty rodzajProperty() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj.set(rodzaj);
    }
}
