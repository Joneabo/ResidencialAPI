package com.residencial.residencial_api.controllers;

import com.residencial.residencial_api.entities.HousePerClient;
import com.residencial.residencial_api.services.IHousePerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/house-per-client")
public class HousePerClientController {

    @Autowired
    private IHousePerClient housePerClientService;

    @GetMapping
    public List<HousePerClient> getAllHousePerClients() {
        return housePerClientService.getAllHousePerClients();
    }

    @GetMapping("/{id}")
    public Optional<HousePerClient> getHousePerClientById(@PathVariable Long id) {
        return housePerClientService.getHousePerClientById(id);
    }

    @PostMapping
    public HousePerClient createHousePerClient(@RequestBody HousePerClient housePerClient) {
        return housePerClientService.saveHousePerClient(housePerClient);
    }

    @PutMapping("/{id}")
    public HousePerClient updateHousePerClient(@PathVariable Long id, @RequestBody HousePerClient housePerClient) {
        housePerClient.setId(id);
        return housePerClientService.saveHousePerClient(housePerClient);
    }

    @DeleteMapping("/{id}")
    public void deleteHousePerClient(@PathVariable Long id) {
        housePerClientService.deleteHousePerClient(id);
    }

    @GetMapping("/client/{clientId}")
    public List<HousePerClient> getHousePerClientsByClientId(@PathVariable Long clientId) {
        return housePerClientService.getHousePerClientsByClientId(clientId);
    }



}
