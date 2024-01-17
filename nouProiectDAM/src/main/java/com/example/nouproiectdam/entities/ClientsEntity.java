
package com.example.nouproiectdam.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "Clients")
public class ClientsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_client;

//    public String id_client() {
//        return String.valueOf(id_client);
//    }
//
//    public void setId_client(String id_client) {
//        this.id_client = Long.valueOf(id_client);
//    }

    @Column
    private String nume;
    @Column
    private String prenume;
    @Column
    private String telefon;
    @Column
    private String adresa;
//    @Column
//    private Long id_vehicul;
//    @Column
//    private String marca;
//    @Column
//    private String model;
//    @Column
//    private String an_fabricatie;
//    @Column
//    private String nr_inmatriculare;
//    @Column
//    private String tip_serviciu;
//    @Column
//    private LocalDateTime dataProgramarii;
    @Column
    private String email;
    public ClientsEntity() {}

    public ClientsEntity(String nume, String prenume, String telefon, String adresa, String email) {
        this.nume = nume;
        this.prenume = prenume;
        this.telefon = telefon;
        this.adresa = adresa;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getAdresa() {
        return adresa;
    }
}

