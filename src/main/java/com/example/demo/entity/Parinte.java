package com.example.demo.entity;

public class Parinte {

    private int idParinte;
    private String numeParinte;
    private String prenumeParinte;
    private String adresa;
    private String email;

    public Parinte(String numeParinte, String prenumeParinte, String adresa, String email) {
        this.numeParinte = numeParinte;
        this.prenumeParinte = prenumeParinte;
        this.adresa = adresa;
        this.email = email;
    }

    public int getIdParinte() {
        return idParinte;
    }

    public String getNumeParinte() {
        return numeParinte;
    }

    public String getPrenumeParinte() {
        return prenumeParinte;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getEmail() {
        return email;
    }

    public void setNumeParinte(String numeParinte) {
        this.numeParinte = numeParinte;
    }

    public void setPrenumeParinte(String prenumeParinte) {
        this.prenumeParinte = prenumeParinte;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setEmail(String email) {
        this.email = email;
    }
//testing dev branch (ofc I forgot about this)
}
