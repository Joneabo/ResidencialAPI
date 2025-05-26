package com.residencial.residencial_api.services;

import com.residencial.residencial_api.entities.Urbanization;
import java.util.List;
import java.util.Optional;

public interface IUrbanization {

    List<Urbanization> getAllUrbanizations();
    Optional<Urbanization> getUrbanizationById(Integer id);
    Urbanization saveUrbanization(Urbanization urbanization);
    void deleteUrbanization(Integer id);

}
