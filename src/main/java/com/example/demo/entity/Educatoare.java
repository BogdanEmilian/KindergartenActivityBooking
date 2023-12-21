package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "educatoare")
public class Educatoare {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEducatoare;

    private String numeEducatoare;

    private String prenumeEducatoare;

    @OneToOne(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinTable(name = "gradinite")
    private Gradinita gradinita;

    public Educatoare(String numeEducatoare, String prenumeEducatoare, Gradinita gradinita) {
        this.numeEducatoare = numeEducatoare;
        this.prenumeEducatoare = prenumeEducatoare;
        this.gradinita = gradinita;
    }

    public Educatoare(){

    }

    public int getIdEducatoare() {
        return idEducatoare;
    }

    public String getNumeEducatoare() {
        return numeEducatoare;
    }

    public String getPrenumeEducatoare() {
        return prenumeEducatoare;
    }

    public Gradinita getGradinita() {
        return gradinita;
    }

    public void setNumeEducatoare(String numeEducatoare) {
        this.numeEducatoare = numeEducatoare;
    }

    public void setPrenumeEducatoare(String prenumeEducatoare) {
        this.prenumeEducatoare = prenumeEducatoare;
    }

    public void setGradinita(Gradinita gradinita) {
        this.gradinita = gradinita;
    }

}
