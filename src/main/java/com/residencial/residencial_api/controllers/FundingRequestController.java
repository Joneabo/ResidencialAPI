package com.residencial.residencial_api.controllers;

import com.residencial.residencial_api.entities.FundingRequest;
import com.residencial.residencial_api.services.IFundingRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;



@RestController
@RequestMapping("/api/funding-requests")
public class FundingRequestController {

    @Autowired
    private IFundingRequest fundingRequestService;

    @GetMapping
    public List<FundingRequest> getAllFundingRequests() {
        return fundingRequestService.getAllFundingRequests();
    }

    @GetMapping("/{id}")
    public Optional<FundingRequest> getFundingRequestById(@PathVariable Long id) {
        return fundingRequestService.getFundingRequestById(id);
    }

    @PostMapping
    public FundingRequest createFundingRequest(@RequestBody FundingRequest fundingRequest) {
        return fundingRequestService.saveFundingRequest(fundingRequest);
    }

    @PutMapping("/{id}")
    public FundingRequest updateFundingRequest(@PathVariable Long id, @RequestBody FundingRequest fundingRequest) {
        fundingRequest.setId(id);
        return fundingRequestService.saveFundingRequest(fundingRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteFundingRequest(@PathVariable Long id) {
        fundingRequestService.deleteFundingRequest(id);
    }

    @GetMapping("/client/{clientId}")
    public List<FundingRequest> getFundingRequestsByClientId(@PathVariable Long clientId) {
        return fundingRequestService.getFundingRequestsByClientId(clientId);
    }

    @GetMapping("/status/{status}")
    public List<FundingRequest> getFundingRequestsByStatus(@PathVariable Boolean status) {
        return fundingRequestService.getFundingRequestsByStatus(status);
    }

}
