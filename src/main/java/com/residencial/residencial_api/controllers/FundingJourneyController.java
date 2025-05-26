package com.residencial.residencial_api.controllers;

import com.residencial.residencial_api.entities.FundingJourney;
import com.residencial.residencial_api.services.IFundingJourney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/funding-journeys")
public class FundingJourneyController {

    @Autowired
    private IFundingJourney fundingJourneyService;

    @GetMapping
    public List<FundingJourney> getAllFundingJourneys() {
        return fundingJourneyService.getAllFundingJourneys();
    }

    @GetMapping("/{id}")
    public Optional<FundingJourney> getFundingJourneyById(@PathVariable Long id) {
        return fundingJourneyService.getFundingJourneyById(id);
    }

    @PostMapping
    public FundingJourney createFundingJourney(@RequestBody FundingJourney fundingJourney) {
        return fundingJourneyService.saveFundingJourney(fundingJourney);
    }

    @PutMapping("/{id}")
    public FundingJourney updateFundingJourney(@PathVariable Long id, @RequestBody FundingJourney fundingJourney) {
        fundingJourney.setId(id);
        return fundingJourneyService.saveFundingJourney(fundingJourney);
    }

    @DeleteMapping("/{id}")
    public void deleteFundingJourney(@PathVariable Long id) {
        fundingJourneyService.deleteFundingJourney(id);
    }

    @GetMapping("/client/{clientId}")
    public List<FundingJourney> getFundingJourneysByClientId(@PathVariable Long clientId) {
        return fundingJourneyService.getFundingJourneysByClientId(clientId);
    }

}
