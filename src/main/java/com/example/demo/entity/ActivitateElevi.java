package com.example.demo.entity;

import java.util.Date;

public class ActivitateElevi {

    private int idActivitate;
    private String numeActivitate;
    private String descriere;
    private Date dataDesfasurare;
    private int idElev;

    public ActivitateElevi(String numeActivitate, String descriere, Date dataDesfasurare, int idElev) {
        this.numeActivitate = numeActivitate;
        this.descriere = descriere;
        this.dataDesfasurare = dataDesfasurare;
        this.idElev = idElev;
    }

    public int getIdActivitate() {
        return idActivitate;
    }

    public String getNumeActivitate() {
        return numeActivitate;
    }

    public String getDescriere() {
        return descriere;
    }

    public Date getDataDesfasurare() {
        return dataDesfasurare;
    }

    public int getIdElev() {
        return idElev;
    }

    public void setNumeActivitate(String numeActivitate) {
        this.numeActivitate = numeActivitate;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public void setDataDesfasurare(Date dataDesfasurare) {
        this.dataDesfasurare = dataDesfasurare;
    }

    public void setIdElev(int idElev) {
        this.idElev = idElev;
    }

}
