package com.example.demo.entity;

import java.util.Date;

public class Programare {

    private int idProgramare;
    private Date dataProgramare;
    private int idElev;
    private int idGradinita;

    public Programare(Date dataProgramare, int idElev, int idGradinita) {
        this.dataProgramare = dataProgramare;
        this.idElev = idElev;
        this.idGradinita = idGradinita;
    }

    public int getIdProgramare() {
        return idProgramare;
    }

    public Date getDataProgramare() {
        return dataProgramare;
    }

    public int getIdElev() {
        return idElev;
    }

    public int getIdGradinita() {
        return idGradinita;
    }

    public void setDataProgramare(Date dataProgramare) {
        this.dataProgramare = dataProgramare;
    }

    public void setIdElev(int idElev) {
        this.idElev = idElev;
    }

    public void setIdGradinita(int idGradinita) {
        this.idGradinita = idGradinita;
    }

}
