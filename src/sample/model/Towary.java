package sample.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Towary {
    private IntegerProperty id_towar;
    private StringProperty typ;
    private StringProperty marka;
    private StringProperty model;
    private IntegerProperty id_kod;
    private StringProperty status_towaru;
    private StringProperty opis;
    private IntegerProperty ilosc;
    private IntegerProperty cena;

    public Towary() {
        this.id_towar = new SimpleIntegerProperty();
        this.typ = new SimpleStringProperty();
        this.marka = new SimpleStringProperty();
        this.model = new SimpleStringProperty();
        this.id_kod = new SimpleIntegerProperty();
        this.status_towaru = new SimpleStringProperty();
        this.opis = new SimpleStringProperty();
        this.ilosc = new SimpleIntegerProperty();
        this.cena = new SimpleIntegerProperty();
    }

    public int getId_towar() {
        return id_towar.get();
    }

    public IntegerProperty id_towarProperty() {
        return id_towar;
    }

    public void setId_towar(int id_towar) {
        this.id_towar.set(id_towar);
    }

    public String getTyp() {
        return typ.get();
    }

    public StringProperty typProperty() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ.set(typ);
    }

    public String getMarka() {
        return marka.get();
    }

    public StringProperty markaProperty() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka.set(marka);
    }

    public String getModel() {
        return model.get();
    }

    public StringProperty modelProperty() {
        return model;
    }

    public void setModel(String model) {
        this.model.set(model);
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

    public String getStatus_towaru() {
        return status_towaru.get();
    }

    public StringProperty status_towaruProperty() {
        return status_towaru;
    }

    public void setStatus_towaru(String status_towaru) {
        this.status_towaru.set(status_towaru);
    }

    public String getOpis() {
        return opis.get();
    }

    public StringProperty opisProperty() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis.set(opis);
    }

    public int getIlosc() {
        return ilosc.get();
    }

    public IntegerProperty iloscProperty() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc.set(ilosc);
    }

    public int getCena() {
        return cena.get();
    }

    public IntegerProperty cenaProperty() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena.set(cena);
    }
}
