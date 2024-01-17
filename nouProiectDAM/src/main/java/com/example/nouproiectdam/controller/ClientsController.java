package com.example.nouproiectdam.controller;

import com.example.nouproiectdam.service.ClientsService;
import com.example.nouproiectdam.dtos.CreateClientDto;
import com.example.nouproiectdam.entities.ClientsEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clienti")
public class ClientsController {
    private final ClientsService clientsService;
    public ClientsController(ClientsService clientsService) {
        this.clientsService = clientsService;
    }
    @PostMapping("/inregistrare")
    public ClientsEntity inregistreazaClient(@RequestBody CreateClientDto createClientDto) throws Exception {
        return clientsService.inregistreazaClient(createClientDto);
    }
}
