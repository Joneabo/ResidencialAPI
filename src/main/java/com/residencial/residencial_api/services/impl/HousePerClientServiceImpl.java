package com.residencial.residencial_api.services.impl;

import com.residencial.residencial_api.entities.HousePerClient;
import com.residencial.residencial_api.repositories.HousePerClientRepository;
import com.residencial.residencial_api.services.IHousePerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;


@Service
public class HousePerClientServiceImpl implements IHousePerClient {

    private final HousePerClientRepository housePerClientRepository;

    @Autowired
    public HousePerClientServiceImpl(HousePerClientRepository housePerClientRepository) {
        this.housePerClientRepository = housePerClientRepository;
    }

    @Override
    public List<HousePerClient> getAllHousePerClients() {
        return housePerClientRepository.findAll();
    }

    @Override
    public Optional<HousePerClient> getHousePerClientById(Long id) {
        return housePerClientRepository.findById(id);
    }

    @Override
    public HousePerClient saveHousePerClient(HousePerClient housePerClient) {
        return housePerClientRepository.save(housePerClient);
    }

    @Override
    public void deleteHousePerClient(Long id) {
        housePerClientRepository.deleteById(id);
    }

    @Override
    public List<HousePerClient> getHousePerClientsByClientId(Long clientId) {
        return housePerClientRepository.findAll().stream()
                .filter(house -> house.getClient().getId().equals(clientId))
                .toList();
    }

    
  


}
