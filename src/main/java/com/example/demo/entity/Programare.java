package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "programari")
public class Programare {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProgramare;

    private Date dataProgramare;

    @OneToOne(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinTable(name = "elevi_programare")
    private Elev elev;

    @OneToOne(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinTable(name = "programare_gradinite")
    private Gradinita gradinita;

    public Programare(Date dataProgramare, Elev elev, Gradinita gradinita) {
        this.dataProgramare = dataProgramare;
        this.elev = elev;
        this.gradinita = gradinita;
    }

    public Programare() {

    }

    public int getIdProgramare() {
        return idProgramare;
    }

    public Date getDataProgramare() {
        return dataProgramare;
    }

    public Elev getElev() {
        return elev;
    }

    public Gradinita getGradinita() {
        return gradinita;
    }

    public void setDataProgramare(Date dataProgramare) {
        this.dataProgramare = dataProgramare;
    }

    public void setElev(Elev elev) {
        this.elev = elev;
    }

    public void setGradinita(Gradinita gradinita) {
        this.gradinita = gradinita;
    }

}
