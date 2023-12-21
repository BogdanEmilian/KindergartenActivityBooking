package com.example.demo.entity;

public class Gradinita {

    private int idGradinita;
    private String numeGradinita;
    private String adresa;
    private String contact;

    public Gradinita(String numeGradinita, String adresa, String contact) {
        this.numeGradinita = numeGradinita;
        this.adresa = adresa;
        this.contact = contact;
    }

    public int getIdGradinita() {
        return idGradinita;
    }

    public String getNumeGradinita() {
        return numeGradinita;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getContact() {
        return contact;
    }

    public void setNumeGradinita(String numeGradinita) {
        this.numeGradinita = numeGradinita;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

}
