package com.example.nouproiectdam;

import com.example.nouproiectdam.classes.Appointment;
import com.example.nouproiectdam.entities.ClientsEntity;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppointmentTest {
    @Test
    public void testAppointmentCreation() {

        ClientsEntity client = new ClientsEntity("Ion", "Popescu", "0700000000", "Strada Exemplu, Nr. 1", "ion.popescu@example.com");

        LocalDateTime dataOra = LocalDateTime.of(2023, 12, 1, 10, 30);
        String descriereServiciu = "Serviciu ";
        Appointment appointment = new Appointment(dataOra, client, descriereServiciu);

        assertEquals(dataOra, appointment.getDataOra());
        assertEquals(client, appointment.getClient());
        assertEquals(descriereServiciu, appointment.getDescriereServiciu());
    }
}
