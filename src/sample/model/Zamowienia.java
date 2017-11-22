package sample.model;

import javafx.beans.property.*;

import java.sql.Date;

public class Zamowienia {
    private IntegerProperty id_zamowienia;
    private IntegerProperty id_koszyk;
    private IntegerProperty id_klient;
    private SimpleObjectProperty<Date> dataZamowienia;
    private IntegerProperty id_platnosc;
    private BooleanProperty zaplacone;
    private BooleanProperty faktura;
    private StringProperty status_zamowienia;
    private IntegerProperty id_transport;
    private StringProperty czas_dostawy;


    public Zamowienia() {
        this.id_zamowienia = new SimpleIntegerProperty();
        this.id_koszyk = new SimpleIntegerProperty();
        this.id_klient = new SimpleIntegerProperty();
        this.dataZamowienia = new SimpleObjectProperty();
        this.id_platnosc = new SimpleIntegerProperty();
        this.zaplacone = new SimpleBooleanProperty();
        this.faktura = new SimpleBooleanProperty();
        this.status_zamowienia = new SimpleStringProperty();
        this.id_transport = new SimpleIntegerProperty();
        this.czas_dostawy = new SimpleStringProperty();
    }

    public int getId_zamowienia() {
        return id_zamowienia.get();
    }

    public IntegerProperty id_zamowieniaProperty() {
        return id_zamowienia;
    }

    public void setId_zamowienia(int id_zamowienia) {
        this.id_zamowienia.set(id_zamowienia);
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

    public int getId_klient() {
        return id_klient.get();
    }

    public IntegerProperty id_klientProperty() {
        return id_klient;
    }

    public void setId_klient(int id_klient) {
        this.id_klient.set(id_klient);
    }

    public Date getDataZamowienia() {
        return dataZamowienia.get();
    }

    public SimpleObjectProperty<Date> dataZamowieniaProperty() {
        return dataZamowienia;
    }

    public void setDataZamowienia(Date dataZamowienia) {
        this.dataZamowienia.set(dataZamowienia);
    }

    public int getId_platnosc() {
        return id_platnosc.get();
    }

    public IntegerProperty id_platnoscProperty() {
        return id_platnosc;
    }

    public void setId_platnosc(int id_platnosc) {
        this.id_platnosc.set(id_platnosc);
    }

    public boolean isZaplacone() {
        return zaplacone.get();
    }

    public BooleanProperty zaplaconeProperty() {
        return zaplacone;
    }

    public void setZaplacone(boolean zaplacone) {
        this.zaplacone.set(zaplacone);
    }

    public boolean isFaktura() {
        return faktura.get();
    }

    public BooleanProperty fakturaProperty() {
        return faktura;
    }

    public void setFaktura(boolean faktura) {
        this.faktura.set(faktura);
    }

    public String getStatus_zamowienia() {
        return status_zamowienia.get();
    }

    public StringProperty status_zamowieniaProperty() {
        return status_zamowienia;
    }

    public void setStatus_zamowienia(String status_zamowienia) {
        this.status_zamowienia.set(status_zamowienia);
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

    public String getCzas_dostawy() {
        return czas_dostawy.get();
    }

    public StringProperty czas_dostawyProperty() {
        return czas_dostawy;
    }

    public void setCzas_dostawy(String czas_dostawy) {
        this.czas_dostawy.set(czas_dostawy);
    }
}
