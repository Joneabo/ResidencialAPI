package com.residencial.residencial_api.services.impl;

import com.residencial.residencial_api.entities.ClientStatus;
import com.residencial.residencial_api.repositories.ClientStatusRepository;
import com.residencial.residencial_api.services.IClientStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ClientStatusServiceImpl implements IClientStatus {

    @Autowired
    private ClientStatusRepository clientStatusRepository;
    

    @Override
    public List<ClientStatus> getAllClientStatuses() {
        return clientStatusRepository.findAll();
    }

    @Override
    public Optional<ClientStatus> getClientStatusById(Long id) {
        return clientStatusRepository.findById(id);
    }

    @Override
    public ClientStatus saveClientStatus(ClientStatus client) {
        return clientStatusRepository.save(client);
    }

    @Override
    public void deleteClientStatus(Long id) {
        clientStatusRepository.deleteById(id);
    }
}
