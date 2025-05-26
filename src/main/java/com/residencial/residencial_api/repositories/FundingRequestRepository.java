package com.residencial.residencial_api.repositories;

import com.residencial.residencial_api.entities.FundingRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FundingRequestRepository extends JpaRepository<FundingRequest, Long> {
    // Custom query methods can be defined here if needed

}
