package com.example.nouproiectdam.repositories;
import com.example.nouproiectdam.classes.Appointment;
import com.example.nouproiectdam.entities.ClientsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByDataOra(LocalDateTime dataOra);

    List<Appointment> findByClient(ClientsEntity client);

    List<Appointment> findByDescriereServiciuContaining(String descriereServiciu);
}
