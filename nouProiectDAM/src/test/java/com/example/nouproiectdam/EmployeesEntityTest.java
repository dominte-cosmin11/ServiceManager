package com.example.nouproiectdam;

import com.example.nouproiectdam.entities.EmployeeEntity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeesEntityTest {
    @Test
    public void testEmployeeCreation() {

        int id = 1;
        String firstName = "Ion";
        String lastName = "Popescu";
        String email = "ion.popescu@example.com";
        String dateOfBirth = "1980-01-01";
        EmployeeEntity employee = new EmployeeEntity(id, firstName, lastName, email, dateOfBirth);


        assertEquals(id, employee.getId());
        assertEquals(firstName, employee.getFirstName());
        assertEquals(lastName, employee.getLastName());
        assertEquals(email, employee.getEmail());
        assertEquals(dateOfBirth, employee.getDateOfBirth());
    }
}
