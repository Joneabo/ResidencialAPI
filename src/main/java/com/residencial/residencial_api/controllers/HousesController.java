package com.residencial.residencial_api.controllers;

import com.residencial.residencial_api.entities.Houses;
import com.residencial.residencial_api.services.IHouses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/houses")
public class HousesController {

    @Autowired
    private IHouses housesService;

    @GetMapping
    public List<Houses> getAllHouses() {
        return housesService.getAllHouses();
    }


    @GetMapping("/{id}")
    public Optional<Houses> getHouseById(@PathVariable Long id) {
        return housesService.getHouseById(id);
    }

    @PostMapping
    public Houses createHouse(@RequestBody Houses house) {
        return housesService.saveHouse(house);
    }

    @PutMapping("/{id}")
    public Houses updateHouse(@PathVariable Long id, @RequestBody Houses house) {
        house.setId(id);
        return housesService.saveHouse(house);
    }

    @DeleteMapping("/{id}")
    public void deleteHouse(@PathVariable Long id) {
        housesService.deleteHouse(id);
    }

}
