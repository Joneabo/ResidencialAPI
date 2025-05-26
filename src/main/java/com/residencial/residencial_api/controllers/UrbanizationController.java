package com.residencial.residencial_api.controllers;

import com.residencial.residencial_api.entities.Urbanization;
import com.residencial.residencial_api.services.IUrbanization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/urbanizations")
public class UrbanizationController {

@Autowired
private IUrbanization urbanizationService;

@GetMapping
public List<Urbanization> getAllUrbanizations() {
    return urbanizationService.getAllUrbanizations();
}


@GetMapping("/{id}")
public Optional<Urbanization> getUrbanizationById(@PathVariable Integer id) {
    return urbanizationService.getUrbanizationById(id);
}

@PostMapping
public Urbanization createUrbanization(@RequestBody Urbanization urbanization) {
    return urbanizationService.saveUrbanization(urbanization);

}


@PutMapping("/{id}")
public Urbanization updateUrbanization(@PathVariable Integer id, @RequestBody Urbanization urbanization) {
    urbanization.setId(id);
    return urbanizationService.saveUrbanization(urbanization);

}

@DeleteMapping("/{id}")
public void deleteUrbanization(@PathVariable Integer id) {
    urbanizationService.deleteUrbanization(id);

}

}