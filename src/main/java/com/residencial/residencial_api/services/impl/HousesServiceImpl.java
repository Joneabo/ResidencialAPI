package com.residencial.residencial_api.services.impl;

import com.residencial.residencial_api.entities.Houses;
import com.residencial.residencial_api.services.IHouses;
import com.residencial.residencial_api.repositories.HousesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class HousesServiceImpl implements IHouses {

    @Autowired
    private HousesRepository housesRepository;

    public HousesServiceImpl(HousesRepository housesRepository) {
        this.housesRepository = housesRepository;
    }

    @Override
    public List<Houses> getAllHouses() {
        return housesRepository.findAll();
    }

    @Override
    public Optional<Houses> getHouseById(Long id) {
        return housesRepository.findById(id);
    }

    @Override
    public Houses saveHouse(Houses house) {
        return housesRepository.save(house);
    }

    @Override
    public void deleteHouse(Long id) {
        housesRepository.deleteById(id);
    }



}
