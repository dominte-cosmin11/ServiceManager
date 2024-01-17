package com.example.nouproiectdam.repositories;
import com.example.nouproiectdam.classes.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface PaymentsRepository  extends JpaRepository<Payments, Long> {
    List<Payments> findByNume(String nume);

    List<Payments> findByPrenume(String prenume);

    Payments findByIdTranzactie(String idTranzactie);

    List<Payments> findByTelefon(String telefon);

    List<Payments> findByNumeBenef(String numeBenef);
}
