package com.example.demo.entity;

public class Educatoare {

    private int idEducatoare;
    private String numeEducatoare;
    private String prenumeEducatoare;
    private int idGradinita;

    public Educatoare(String numeEducatoare, String prenumeEducatoare, int idGradinita) {
        this.numeEducatoare = numeEducatoare;
        this.prenumeEducatoare = prenumeEducatoare;
        this.idGradinita = idGradinita;
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

    public int getIdGradinita() {
        return idGradinita;
    }

    public void setNumeEducatoare(String numeEducatoare) {
        this.numeEducatoare = numeEducatoare;
    }

    public void setPrenumeEducatoare(String prenumeEducatoare) {
        this.prenumeEducatoare = prenumeEducatoare;
    }

    public void setIdGradinita(int idGradinita) {
        this.idGradinita = idGradinita;
    }

}
