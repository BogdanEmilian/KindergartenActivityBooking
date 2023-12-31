package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "gradinite")
public class Gradinita {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idGradinita;

    private String numeGradinita;

    @Column(length = 500)
    private String adresa;

    private String contact;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinTable(name = "educatoare_gradinita")
    private List<Educatoare> listaEducatoare;

    public Gradinita(String numeGradinita, String adresa, String contact) {
        this.numeGradinita = numeGradinita;
        this.adresa = adresa;
        this.contact = contact;
        this.listaEducatoare = new ArrayList<>();
    }

    public Gradinita(){

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

    public List<Educatoare> getListaEducatoare() {
        return listaEducatoare;
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

    public void addEducatoare(Educatoare educatoare) {
        this.listaEducatoare.add(educatoare);
    }
}
