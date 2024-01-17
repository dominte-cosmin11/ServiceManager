package com.example.nouproiectdam.repositories;
import com.example.nouproiectdam.entities.ClientsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ClientsRepository extends JpaRepository<ClientsEntity, Long> {

     Optional<ClientsEntity> findByEmail(String email);

}
