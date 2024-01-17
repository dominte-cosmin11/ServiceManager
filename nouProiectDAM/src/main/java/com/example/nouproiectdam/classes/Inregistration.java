package com.example.nouproiectdam.classes;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "inregistration")
public class Inregistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_client")
    private String idClient;

   @Column(name = "data_inregistrare")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataInregistrare;

    @Column(name = "detalii")
    private String detalii;

    // Constructori, getteri și setteri

    public Inregistration(String number, String a, String manager) {
    }

    public Inregistration(String idClient, String detalii) {
        this.idClient = idClient;
        this.dataInregistrare = dataInregistrare;
        this.detalii = detalii;
    }

    public Inregistration() {

    }

    // Getteri și setteri pentru id, idClient, dataInregistrare, detalii

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public Date getDataInregistrare() {
        return dataInregistrare;
    }

    public void setDataInregistrare(Date dataInregistrare) {
        this.dataInregistrare = dataInregistrare;
    }

    public String getDetalii() {
        return detalii;
    }

    public void setDetalii(String detalii) {
        this.detalii = detalii;
    }
}
