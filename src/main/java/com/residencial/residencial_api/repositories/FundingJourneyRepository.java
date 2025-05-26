package com.residencial.residencial_api.repositories;

import com.residencial.residencial_api.entities.FundingJourney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface FundingJourneyRepository extends JpaRepository<FundingJourney, Long> {
    // Custom query methods can be defined here if needed

}
