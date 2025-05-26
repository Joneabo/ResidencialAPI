package com.residencial.residencial_api.services.impl;

import com.residencial.residencial_api.entities.FundingRequest;
import com.residencial.residencial_api.repositories.FundingRequestRepository;
import com.residencial.residencial_api.services.IFundingRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FundingRequestServiceImpl implements IFundingRequest {

    private final FundingRequestRepository fundingRequestRepository;

    @Autowired
    public FundingRequestServiceImpl(FundingRequestRepository fundingRequestRepository) {
        this.fundingRequestRepository = fundingRequestRepository;
    }

    public List<FundingRequest> getAllFundingRequests() {
        return fundingRequestRepository.findAll();
    }

    public Optional<FundingRequest> getFundingRequestById(Long id) {
        return fundingRequestRepository.findById(id);
    }

    public FundingRequest saveFundingRequest(FundingRequest fundingRequest) {
        return fundingRequestRepository.save(fundingRequest);
    }

    public void deleteFundingRequest(Long id) {
        fundingRequestRepository.deleteById(id);
    }

    public List<FundingRequest> getFundingRequestsByClientId(Long clientId) {
        return fundingRequestRepository.findAll().stream()
                .filter(request -> request.getClient().getId().equals(clientId))
                .toList();
    }

    public List<FundingRequest> getFundingRequestsByStatus(Boolean status) {
        return fundingRequestRepository.findAll().stream()
                .filter(request -> Objects.equals(request.getStatus(), status))
                .toList();
    }


}
