package com.example.nouproiectdam.classes;

import jakarta.persistence.*;

@Entity
@Table(name = "payments")
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nume")
    private String nume;

    @Column(name = "prenume")
    private String prenume;

    @Column(name = "id_tranzactie")
    private String idTranzactie;

    @Column(name = "telefon")
    private String telefon;

    @Column(name = "nume_benef")
    private String numeBenef;

    // Constructor implicit necesar pentru JPA
    public Payments() {
    }

    // Constructor cu parametri
    public Payments(String nume, String prenume, String idTranzactie, String telefon, String numeBenef) {
        this.nume = nume;
        this.prenume = prenume;
        this.idTranzactie = idTranzactie;
        this.telefon = telefon;
        this.numeBenef = numeBenef;
    }

    // Getteri și setteri
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getIdTranzactie() {
        return idTranzactie;
    }

    public void setIdTranzactie(String idTranzactie) {
        this.idTranzactie = idTranzactie;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getNumeBenef() {
        return numeBenef;
    }

    public void setNumeBenef(String numeBenef) {
        this.numeBenef = numeBenef;
    }


}
