package com.example.demo.entity;

import com.example.demo.hashing.PasswordHashing;
import jakarta.persistence.*;

@Entity
@Table(name = "parinti")
public class Parinte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idParinte;

    private String numeParinte;

    private String prenumeParinte;

    @Column(length = 500)
    private String adresa;

    private String email;

    private String passwordHash;

    public Parinte(String numeParinte, String prenumeParinte, String adresa, String email, String password) {
        this.numeParinte = numeParinte;
        this.prenumeParinte = prenumeParinte;
        this.adresa = adresa;
        this.email = email;
        this.passwordHash = PasswordHashing.hash(password);
    }

    public Parinte(){

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

    public String getPasswordHash() {
        return passwordHash;
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

    public void setPasswordHash(String password) {
        this.passwordHash = PasswordHashing.hash(password);
    }
}
