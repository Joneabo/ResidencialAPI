package com.residencial.residencial_api.services;

import com.residencial.residencial_api.entities.Houses;
import java.util.List;
import java.util.Optional;

public interface IHouses {

    List<Houses> getAllHouses();
    Optional<Houses> getHouseById(Long id);
    Houses saveHouse(Houses house);
    void deleteHouse(Long id);

}
