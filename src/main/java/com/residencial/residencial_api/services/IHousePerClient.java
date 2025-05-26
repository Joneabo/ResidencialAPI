package com.residencial.residencial_api.services;

import com.residencial.residencial_api.entities.HousePerClient;
import java.util.*;


public interface IHousePerClient {

    List<HousePerClient> getAllHousePerClients();
    Optional<HousePerClient> getHousePerClientById(Long id);
    HousePerClient saveHousePerClient(HousePerClient housePerClient);
    void deleteHousePerClient(Long id);
    List<HousePerClient> getHousePerClientsByClientId(Long clientId);

}
