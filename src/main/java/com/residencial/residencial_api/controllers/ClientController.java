package com.residencial.residencial_api.controllers;

import com.residencial.residencial_api.entities.Client;
import com.residencial.residencial_api.services.IClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

@Autowired
private IClient clientService;

@GetMapping
public List<Client> getAllClients() {
    return clientService.getAllClients();

}

@GetMapping("/{id}")
public Optional<Client> getClientById(@PathVariable Long id) {
    return clientService.getClientById(id);

}

@PostMapping
public Client createClient(@RequestBody Client client) {
    return clientService.saveClient(client);

}

@PutMapping("/{id}")
public Client updateClient(@PathVariable Long id, @RequestBody Client client) {
    client.setId(id);
    return clientService.saveClient(client);

}

@DeleteMapping("/{id}")
public void deleteClient(@PathVariable Long id) {
    clientService.deleteClient(id);

}

}