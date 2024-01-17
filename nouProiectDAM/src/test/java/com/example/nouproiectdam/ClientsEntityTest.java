package com.example.nouproiectdam;

import com.example.nouproiectdam.entities.ClientsEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ClientsEntityTest {
    @Test
    public void testClients() {
        ClientsEntity client = new ClientsEntity("Ion", "Popescu", "0700000000", "Strada Exemplu, Nr. 1", "ion.popescu@example.com");

        // Verifică dacă getterii returnează datele corecte
        assertEquals("Ion", client.getNume());
        assertEquals("Popescu", client.getPrenume());
        assertEquals("0700000000", client.getTelefon());
        assertEquals("Strada Exemplu, Nr. 1", client.getAdresa());
        assertEquals("ion.popescu@example.com", client.getEmail());

    }
}
