package sample.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import javax.swing.plaf.TableHeaderUI;

public class Koszyk {
    private IntegerProperty id_koszyk;
    private IntegerProperty id_towar;
    private IntegerProperty ilosc;
    private IntegerProperty cena;

    public Koszyk() {
        this.id_koszyk = new SimpleIntegerProperty();
        this.id_towar = new SimpleIntegerProperty();
        this.ilosc = new SimpleIntegerProperty();
        this.cena = new SimpleIntegerProperty();
    }

    public int getId_koszyk() {
        return id_koszyk.get();
    }

    public IntegerProperty id_koszykProperty() {
        return id_koszyk;
    }

    public void setId_koszyk(int id_koszyk) {
        this.id_koszyk.set(id_koszyk);
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
