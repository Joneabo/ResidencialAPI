package com.residencial.residencial_api.services.impl;

import com.residencial.residencial_api.entities.FundingJourney;
import com.residencial.residencial_api.repositories.FundingJourneyRepository;
import com.residencial.residencial_api.services.IFundingJourney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FundingJourneyServiceImpl implements IFundingJourney {

    private final FundingJourneyRepository fundingJourneyRepository;

    @Autowired
    public FundingJourneyServiceImpl(FundingJourneyRepository fundingJourneyRepository) {
        this.fundingJourneyRepository = fundingJourneyRepository;
    }

    @Override
    public List<FundingJourney> getAllFundingJourneys() {
        return fundingJourneyRepository.findAll();
    }

    @Override
    public Optional<FundingJourney> getFundingJourneyById(Long id) {
        return fundingJourneyRepository.findById(id);
    }

    @Override
    public FundingJourney saveFundingJourney(FundingJourney fundingJourney) {
        return fundingJourneyRepository.save(fundingJourney);
    }

    @Override
    public void deleteFundingJourney(Long id) {
        fundingJourneyRepository.deleteById(id);
    }

    @Override
    public List<FundingJourney> getFundingJourneysByClientId(Long clientId) {
        return fundingJourneyRepository.findAll().stream()
                .filter(journey -> journey.getClient().getId().equals(clientId))
                .toList();
    }


}
