package com.residencial.residencial_api.repositories;

import com.residencial.residencial_api.entities.ClientStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ClientStatusRepository extends JpaRepository<ClientStatus, Long> {
    // Custom query methods can be defined here if needed

}
