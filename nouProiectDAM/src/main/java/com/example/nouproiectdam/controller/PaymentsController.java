package com.example.nouproiectdam.controller;

import com.example.nouproiectdam.classes.Payments;
import com.example.nouproiectdam.repositories.PaymentsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentsController {
    private final PaymentsRepository paymentsRepository;

    public PaymentsController(PaymentsRepository paymentsRepository) {
        this.paymentsRepository = paymentsRepository;
    }

    @GetMapping
    public List<Payments> getAllPayments() {
        return paymentsRepository.findAll();
    }

}
