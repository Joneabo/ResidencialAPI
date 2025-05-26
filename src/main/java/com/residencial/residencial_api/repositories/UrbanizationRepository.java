package com.residencial.residencial_api.repositories;

import com.residencial.residencial_api.entities.Urbanization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UrbanizationRepository extends JpaRepository<Urbanization, Integer> {
    // Aquí puedes agregar métodos personalizados si es necesario

}
