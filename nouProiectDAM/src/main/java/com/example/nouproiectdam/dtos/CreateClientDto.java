package com.example.nouproiectdam.dtos;

public class CreateClientDto {

    private String nume;
    private String prenume;
    private  String email;
    private  String telefon;

    // Constructor fără argumente
    public CreateClientDto() {
    }

    // Constructor cu argumente
    public CreateClientDto(String nume, String prenume, String email, String telefon) {
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.telefon = telefon;
    }

    // Getteri și setteri

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String email() {
        return email;
    }

    public String prenume() {
        return prenume;
    }
}
