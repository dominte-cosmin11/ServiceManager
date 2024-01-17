package com.example.nouproiectdam;

import com.example.nouproiectdam.classes.Payments;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentsTest {
    @Test
    public void testPaymentsCreation() {

        String nume = "Ion";
        String prenume = "Popescu";
        String id_tranzactie = "12345";
        String telefon = "0700000000";
        String nume_benef = "Gigel";
        Payments payment = new Payments(nume, prenume, id_tranzactie, telefon, nume_benef);


        assertEquals(nume, payment.getNume());
        assertEquals(prenume, payment.getPrenume());
        assertEquals(id_tranzactie, payment.getIdTranzactie());
        assertEquals(telefon, payment.getTelefon());
        assertEquals(nume_benef, payment.getNumeBenef());
    }
}
