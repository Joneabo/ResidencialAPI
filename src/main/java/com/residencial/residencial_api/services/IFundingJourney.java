package com.residencial.residencial_api.services;

import com.residencial.residencial_api.entities.FundingJourney;
import java.util.*;



public interface IFundingJourney {

    List<FundingJourney> getAllFundingJourneys();
    Optional<FundingJourney> getFundingJourneyById(Long id);
    FundingJourney saveFundingJourney(FundingJourney fundingJourney);
    void deleteFundingJourney(Long id);
    List<FundingJourney> getFundingJourneysByClientId(Long clientId);

}
