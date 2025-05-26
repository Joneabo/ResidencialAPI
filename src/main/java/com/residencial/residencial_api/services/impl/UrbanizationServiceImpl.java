package com.residencial.residencial_api.services.impl;

import com.residencial.residencial_api.entities.Urbanization;
import com.residencial.residencial_api.repositories.UrbanizationRepository;
import com.residencial.residencial_api.services.IUrbanization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class UrbanizationServiceImpl implements IUrbanization{

    @Autowired
    private UrbanizationRepository urbanizationRepository;

   @Override
    public List<Urbanization> getAllUrbanizations() {
        return urbanizationRepository.findAll();
    }

    @Override
    public Optional <Urbanization>getUrbanizationById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Urbanization saveUrbanization(Urbanization urbanization) {
        return urbanizationRepository.save(urbanization);
    }

    @Override
    public void deleteUrbanization(Integer id) {
        urbanizationRepository.deleteById(id);
    }

    


}
