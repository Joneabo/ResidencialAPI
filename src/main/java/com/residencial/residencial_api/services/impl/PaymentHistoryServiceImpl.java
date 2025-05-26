package com.residencial.residencial_api.services.impl;

import com.residencial.residencial_api.entities.PaymentHistory;
import com.residencial.residencial_api.repositories.PaymentHistoryRepository;
import com.residencial.residencial_api.services.IPaymentHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class PaymentHistoryServiceImpl implements IPaymentHistory{

    @Autowired
    private PaymentHistoryRepository repository;

    @Override
    public List<PaymentHistory> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<PaymentHistory> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public PaymentHistory save(PaymentHistory paymentHistory) {
        return repository.save(paymentHistory);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
