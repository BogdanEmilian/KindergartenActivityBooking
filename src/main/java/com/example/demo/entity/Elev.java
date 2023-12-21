package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "elevi")
public class Elev {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idElev;

    private String nume;

    private String prenume;

    private Date dataNastere;

    @Column(length = 500)
    private String adresa;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinTable(name = "parinti")
    private List<Parinte> listaParinti;

    public Elev(String nume, String prenume, Date dataNastere, String adresa, List<Parinte> listaParinti) {
        this.nume = nume;
        this.prenume = prenume;
        this.dataNastere = dataNastere;
        this.adresa = adresa;
        this.listaParinti = listaParinti;
    }

    public Elev(){

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

    public List<Parinte> getListaParinti() {
        return listaParinti;
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

    public void setListaParinti(List<Parinte> listaParinti) {
        this.listaParinti = listaParinti;
    }

}
