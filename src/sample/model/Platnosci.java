package sample.model;
/**
 * Create by: maciejziolkowski on 05 gru 2017
 */

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Platnosci {
    private IntegerProperty id_patnosci;
    private BooleanProperty gotowka;
    private BooleanProperty przelew;
    private IntegerProperty kwota;

    public Platnosci() {
        this.id_patnosci = new SimpleIntegerProperty();
        this.gotowka = new SimpleBooleanProperty();
        this.przelew = new SimpleBooleanProperty();
        this.kwota = new SimpleIntegerProperty();
    }

    public int getId_patnosci() {
        return id_patnosci.get();
    }

    public IntegerProperty id_patnosciProperty() {
        return id_patnosci;
    }

    public void setId_patnosci(int id_patnosci) {
        this.id_patnosci.set(id_patnosci);
    }

    public boolean isGotowka() {
        return gotowka.get();
    }

    public BooleanProperty gotowkaProperty() {
        return gotowka;
    }

    public void setGotowka(boolean gotowka) {
        this.gotowka.set(gotowka);
    }

    public boolean isPrzelew() {
        return przelew.get();
    }

    public BooleanProperty przelewProperty() {
        return przelew;
    }

    public void setPrzelew(boolean przelew) {
        this.przelew.set(przelew);
    }

    public int getKwota() {
        return kwota.get();
    }

    public IntegerProperty kwotaProperty() {
        return kwota;
    }

    public void setKwota(int kwota) {
        this.kwota.set(kwota);
    }
}
