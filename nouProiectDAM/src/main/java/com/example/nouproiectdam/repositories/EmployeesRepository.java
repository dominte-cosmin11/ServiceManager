package com.example.nouproiectdam.repositories;
import com.example.nouproiectdam.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeesRepository extends JpaRepository<EmployeeEntity, Integer> {
    List<EmployeeEntity> findByLastName(String lastName);

    EmployeeEntity findByEmail(String email);
}
