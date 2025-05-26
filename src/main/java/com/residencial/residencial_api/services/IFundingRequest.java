package com.residencial.residencial_api.services;

import com.residencial.residencial_api.entities.FundingRequest;

import java.util.*;

public interface IFundingRequest {

    List<FundingRequest> getAllFundingRequests();
    Optional<FundingRequest> getFundingRequestById(Long id);
    FundingRequest saveFundingRequest(FundingRequest fundingRequest);
    void deleteFundingRequest(Long id);
    List<FundingRequest> getFundingRequestsByClientId(Long clientId);
    List<FundingRequest> getFundingRequestsByStatus(Boolean status);

}
