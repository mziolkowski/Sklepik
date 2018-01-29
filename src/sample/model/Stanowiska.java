package sample.model;
/**
 * Create by: maciejziolkowski on 05 gru 2017
 */

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Stanowiska {
    private IntegerProperty id_stanowiska;
    private StringProperty nazwa;

    public Stanowiska() {
        this.id_stanowiska = new SimpleIntegerProperty();
        this.nazwa = new SimpleStringProperty();
    }

    public int getId_stanowiska() {
        return id_stanowiska.get();
    }

    public IntegerProperty id_stanowiskaProperty() {
        return id_stanowiska;
    }

    public void setId_stanowiska(int id_stanowiska) {
        this.id_stanowiska.set(id_stanowiska);
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
}
