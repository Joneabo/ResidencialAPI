package com.residencial.residencial_api.controllers;

import com.residencial.residencial_api.entities.ClientStatus;
import com.residencial.residencial_api.services.IClientStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/clientstatus")
public class ClientStatusController {

@Autowired
private IClientStatus clientStatusService;


@GetMapping
public List<ClientStatus> getAllClientStatus() {
    return clientStatusService.getAllClientStatuses();

}

@GetMapping("/{id}")
public Optional<ClientStatus> getClientStatusById(@PathVariable Long id) {
    return clientStatusService.getClientStatusById(id);

}

@PostMapping
public ClientStatus createClientStatus(@RequestBody ClientStatus clientStatus) {
    return clientStatusService.saveClientStatus(clientStatus);

}

@PutMapping("/{id}")
public ClientStatus updateClientStatus(@PathVariable Long id, @RequestBody ClientStatus clientStatus) {
    clientStatus.setId(id);
    return clientStatusService.saveClientStatus(clientStatus);

}

@DeleteMapping("/{id}")
public void deleteClientStatus(@PathVariable Long id) {
    clientStatusService.deleteClientStatus(id);

}


}
