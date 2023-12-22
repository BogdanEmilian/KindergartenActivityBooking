package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "activitati")
public class ActivitateElevi {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idActivitate;

    private String numeActivitate;

    @Column(length = 1024)
    private String descriere;

    private Date dataDesfasurare;

    @OneToOne(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            optional = true
    )
    @JoinTable(name = "activitati_elevi")
    private Elev elev;

    public ActivitateElevi(String numeActivitate, String descriere, Date dataDesfasurare, Elev elev) {
        this.numeActivitate = numeActivitate;
        this.descriere = descriere;
        this.dataDesfasurare = dataDesfasurare;
        this.elev = elev;
    }

    public ActivitateElevi() {

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

    public Elev getElev() {
        return elev;
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

    public void setElev(Elev elev) {
        this.elev = elev;
    }

}
