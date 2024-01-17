package com.example.nouproiectdam.entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonGetter;
import jakarta.persistence.*;


@Entity
@Table(name = "employees") // Numele tabelului în baza de date
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    // Constructor implicit necesar pentru JPA
    public EmployeeEntity() {
    }

    // Constructor cu parametri
    public EmployeeEntity(int id, String firstName, String lastName, String email, String dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }


    public int getId() {
        return id;
    }
}
