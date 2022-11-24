package com.learn.lista;

public class Przepis {
    private String nazwa;
    private  int id_p;
    private String listaSkladnikow;
    private int idObrazka;

    public Przepis(String nazwa, int id_p, String listaSkladnikow, int idObrazka) {
        this.nazwa = nazwa;
        this.id_p = id_p;
        this.listaSkladnikow = listaSkladnikow;
        this.idObrazka = idObrazka;
    }

    @Override
    public String toString() {
        return nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getId_p() {
        return id_p;
    }

    public void setId_p(int id_p) {
        this.id_p = id_p;
    }

    public String getListaSkladnikow() {
        return listaSkladnikow;
    }

    public void setListaSkladnikow(String listaSkladnikow) {
        this.listaSkladnikow = listaSkladnikow;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public void setIdObrazka(int idObrazka) {
        this.idObrazka = idObrazka;
    }
}
