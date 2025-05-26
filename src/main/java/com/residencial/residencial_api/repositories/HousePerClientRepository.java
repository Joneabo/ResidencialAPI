package com.residencial.residencial_api.repositories;

import com.residencial.residencial_api.entities.HousePerClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HousePerClientRepository extends JpaRepository<HousePerClient, Long> {
    // Custom query methods can be defined here if needed

}
