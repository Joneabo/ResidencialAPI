package com.residencial.residencial_api.services;

import com.residencial.residencial_api.entities.ClientStatus;

import java.util.List;
import java.util.Optional;

public interface IClientStatus {

    List<ClientStatus> getAllClientStatuses();
    Optional<ClientStatus> getClientStatusById(Long id);
    ClientStatus saveClientStatus(ClientStatus client);
    void deleteClientStatus(Long id);

}
