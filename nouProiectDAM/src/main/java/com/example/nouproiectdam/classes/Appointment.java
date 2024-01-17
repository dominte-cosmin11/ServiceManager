package com.example.nouproiectdam.classes;
import com.example.nouproiectdam.entities.ClientsEntity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "programari")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dataOra;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
  protected ClientsEntity client;

    private String descriereServiciu;
    public Appointment() {

    }
    public Appointment(LocalDateTime dataOra, ClientsEntity client, String descriereServiciu) {
        this.dataOra = dataOra;
        this.client = client;
        this.descriereServiciu = descriereServiciu;
    }

    public LocalDateTime getDataOra() {
        return dataOra;
    }

    public ClientsEntity getClient() {
       return client;
    }

    public String getDescriereServiciu() {
        return descriereServiciu;
    }
}
