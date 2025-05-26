package com.residencial.residencial_api.repositories;

import com.residencial.residencial_api.entities.Houses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface HousesRepository extends JpaRepository<Houses, Long> {


}
