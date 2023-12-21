package com.example.demo.entity;

import java.util.Date;

public class Elev {

    private int idElev;
    private String nume;
    private String prenume;
    private Date dataNastere;
    private String adresa;
    private int idParinte;

    public Elev(String nume, String prenume, Date dataNastere, String adresa, int idParinte) {
        this.nume = nume;
        this.prenume = prenume;
        this.dataNastere = dataNastere;
        this.adresa = adresa;
        this.idParinte = idParinte;
    }

    public int getIdElev() {
        return idElev;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Date getDataNastere() {
        return dataNastere;
    }

    public String getAdresa() {
        return adresa;
    }

    public int getIdParinte() {
        return idParinte;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setDataNastere(Date dataNastere) {
        this.dataNastere = dataNastere;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setIdParinte(int idParinte) {
        this.idParinte = idParinte;
    }

}
