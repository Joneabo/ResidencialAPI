package com.residencial.residencial_api.services;

import com.residencial.residencial_api.entities.Client;

import java.util.List;
import java.util.Optional;

public interface IClient {

    List<Client> getAllClients();
    Optional<Client> getClientById(Long id);
    Client saveClient(Client client);
    void deleteClient(Long id);
}