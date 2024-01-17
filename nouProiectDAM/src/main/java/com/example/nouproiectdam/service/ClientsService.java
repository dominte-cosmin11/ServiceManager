package com.example.nouproiectdam.service;

import com.example.nouproiectdam.classes.BCryptPasswordEncoder;
import com.example.nouproiectdam.dtos.CreateClientDto;
import com.example.nouproiectdam.repositories.ClientsRepository;
import com.example.nouproiectdam.entities.ClientsEntity;
import org.springframework.stereotype.Service;

@Service
public class ClientsService {
    private final ClientsRepository clientiRepository;
    private final BCryptPasswordEncoder passwordEncoder;

     ClientsService(ClientsRepository clientiRepository) {
        this.clientiRepository = clientiRepository;
        passwordEncoder = null;
    }
    public ClientsEntity inregistreazaClient(CreateClientDto createClientDto) throws Exception {
        if (emailExista(createClientDto.email())) {
            throw new Exception("Există deja un cont cu acest email.");
        }
//        client.setParola(passwordEncoder.encode(client.getParola()));
        var newClient = new ClientsEntity(createClientDto.getNume(), createClientDto.prenume(), createClientDto.getTelefon(), createClientDto.getTelefon(),createClientDto.email());
        return clientiRepository.save(newClient);
    }

    private boolean emailExista(String email) {
        return clientiRepository.findByEmail(email).isPresent();
    }
}

