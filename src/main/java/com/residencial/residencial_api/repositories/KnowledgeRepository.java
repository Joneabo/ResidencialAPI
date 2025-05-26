package com.residencial.residencial_api.repositories;

import com.residencial.residencial_api.entities.Knowledge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KnowledgeRepository extends JpaRepository<Knowledge, Long> {
    // Custom query methods can be defined here if needed

}
