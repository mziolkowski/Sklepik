package sample.model;

import javafx.beans.property.*;

public class Klient {

    private IntegerProperty id_klient;
    private StringProperty firma;
    private StringProperty imie;
    private StringProperty nazwisko;
    private StringProperty adres;
    private StringProperty kod_pocztowy;
    private StringProperty miejscowosc;
    private StringProperty telefon;
    private StringProperty mail;
    private BooleanProperty staly_klient;

    public Klient() {
        this.id_klient = new SimpleIntegerProperty();
        this.imie = new SimpleStringProperty();
        this.firma = new SimpleStringProperty();
        this.nazwisko = new SimpleStringProperty();
        this.adres = new SimpleStringProperty();
        this.kod_pocztowy = new SimpleStringProperty();
        this.miejscowosc = new SimpleStringProperty();
        this.telefon = new SimpleStringProperty();
        this.mail = new SimpleStringProperty();
        this.staly_klient = new SimpleBooleanProperty();
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

    public String getFirma() {
        return firma.get();
    }

    public StringProperty firmaProperty() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma.set(firma);
    }

    public String getImie() {
        return imie.get();
    }

    public StringProperty imieProperty() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie.set(imie);
    }

    public String getNazwisko() {
        return nazwisko.get();
    }

    public StringProperty nazwiskoProperty() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko.set(nazwisko);
    }

    public String getAdres() {
        return adres.get();
    }

    public StringProperty adresProperty() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres.set(adres);
    }

    public String getKod_pocztowy() {
        return kod_pocztowy.get();
    }

    public StringProperty kod_pocztowyProperty() {
        return kod_pocztowy;
    }

    public void setKod_pocztowy(String kod_pocztowy) {
        this.kod_pocztowy.set(kod_pocztowy);
    }

    public String getMiejscowosc() {
        return miejscowosc.get();
    }

    public StringProperty miejscowoscProperty() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc.set(miejscowosc);
    }

    public String getTelefon() {
        return telefon.get();
    }

    public StringProperty telefonProperty() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon.set(telefon);
    }

    public String getMail() {
        return mail.get();
    }

    public StringProperty mailProperty() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail.set(mail);
    }

    public boolean isStaly_klient() {
        return staly_klient.get();
    }

    public BooleanProperty staly_klientProperty() {
        return staly_klient;
    }

    public void setStaly_klient(boolean staly_klient) {
        this.staly_klient.set(staly_klient);
    }
}
