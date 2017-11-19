package sample.model;

import javafx.beans.property.*;

import java.util.Date;

/**
 * Created by maciejziolkowski on 12.11.2017.
 */
public class Pracownicy {
    private IntegerProperty id_pracownicy;
    private StringProperty imie;
    private StringProperty nazwisko;
    private SimpleObjectProperty<Date> dataUrodzenia;
    private StringProperty miasto;
    private StringProperty adres;
    private StringProperty telefon;
    private SimpleObjectProperty<Date> dataZatrudnienia;
    private SimpleObjectProperty<Date> dataZwolnienia;
    private StringProperty email;
    private IntegerProperty premia;
    private IntegerProperty pensja;
    private IntegerProperty id_stanowiska;

    public Pracownicy() {
        this.id_pracownicy = new SimpleIntegerProperty();
        this.imie = new SimpleStringProperty();
        this.nazwisko = new SimpleStringProperty();
        this.dataUrodzenia = new SimpleObjectProperty<Date>();
        this.miasto = new SimpleStringProperty();
        this.adres = new SimpleStringProperty();
        this.telefon = new SimpleStringProperty();
        this.dataZatrudnienia = new SimpleObjectProperty<Date>();
        this.dataZwolnienia = new SimpleObjectProperty<Date>();
        this.email = new SimpleStringProperty();
        this.premia = new SimpleIntegerProperty();
        this.pensja = new SimpleIntegerProperty();
        this.id_stanowiska = new SimpleIntegerProperty();
    }

    public int getId_pracownicy() {
        return id_pracownicy.get();
    }

    public IntegerProperty id_pracownicyProperty() {
        return id_pracownicy;
    }

    public void setId_pracownicy(int id_pracownicy) {
        this.id_pracownicy.set(id_pracownicy);
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

    public Date getDataUrodzenia() {
        return dataUrodzenia.get();
    }

    public SimpleObjectProperty<Date> dataUrodzeniaProperty() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia.set(dataUrodzenia);
    }

    public String getMiasto() {
        return miasto.get();
    }

    public StringProperty miastoProperty() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto.set(miasto);
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

    public String getTelefon() {
        return telefon.get();
    }

    public StringProperty telefonProperty() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon.set(telefon);
    }

    public Date getDataZatrudnienia() {
        return dataZatrudnienia.get();
    }

    public SimpleObjectProperty<Date> dataZatrudnieniaProperty() {
        return dataZatrudnienia;
    }

    public void setDataZatrudnienia(Date dataZatrudnienia) {
        this.dataZatrudnienia.set(dataZatrudnienia);
    }

    public Date getDataZwolnienia() {
        return dataZwolnienia.get();
    }

    public SimpleObjectProperty<Date> dataZwolnieniaProperty() {
        return dataZwolnienia;
    }

    public void setDataZwolnienia(Date dataZwolnienia) {
        this.dataZwolnienia.set(dataZwolnienia);
    }

    public String getEmail() {
        return email.get();
    }

    public StringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public int getPremia() {
        return premia.get();
    }

    public IntegerProperty premiaProperty() {
        return premia;
    }

    public void setPremia(int premia) {
        this.premia.set(premia);
    }

    public int getPensja() {
        return pensja.get();
    }

    public IntegerProperty pensjaProperty() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja.set(pensja);
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
}
