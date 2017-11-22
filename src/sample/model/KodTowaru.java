package sample.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class KodTowaru {
    private IntegerProperty id_kod;
    private StringProperty magazyn;
    private StringProperty hala;
    private StringProperty poziom;
    private StringProperty regal;
    private StringProperty polka;

    public KodTowaru() {
        this.id_kod = new SimpleIntegerProperty();
        this.magazyn = new SimpleStringProperty();
        this.hala = new SimpleStringProperty();
        this.poziom = new SimpleStringProperty();
        this.regal = new SimpleStringProperty();
        this.polka = new SimpleStringProperty();
    }

    public int getId_kod() {
        return id_kod.get();
    }

    public IntegerProperty id_kodProperty() {
        return id_kod;
    }

    public void setId_kod(int id_kod) {
        this.id_kod.set(id_kod);
    }

    public String getMagazyn() {
        return magazyn.get();
    }

    public StringProperty magazynProperty() {
        return magazyn;
    }

    public void setMagazyn(String magazyn) {
        this.magazyn.set(magazyn);
    }

    public String getHala() {
        return hala.get();
    }

    public StringProperty halaProperty() {
        return hala;
    }

    public void setHala(String hala) {
        this.hala.set(hala);
    }

    public String getPoziom() {
        return poziom.get();
    }

    public StringProperty poziomProperty() {
        return poziom;
    }

    public void setPoziom(String poziom) {
        this.poziom.set(poziom);
    }

    public String getRegal() {
        return regal.get();
    }

    public StringProperty regalProperty() {
        return regal;
    }

    public void setRegal(String regal) {
        this.regal.set(regal);
    }

    public String getPolka() {
        return polka.get();
    }

    public StringProperty polkaProperty() {
        return polka;
    }

    public void setPolka(String polka) {
        this.polka.set(polka);
    }
}

