package com.residencial.residencial_api.services.impl;

import com.residencial.residencial_api.entities.PaymentMethod;
import com.residencial.residencial_api.repositories.PaymentMethodRepository;
import com.residencial.residencial_api.services.IPaymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service

public class PaymentMethodServiceImpl implements IPaymentMethod {

    @Autowired
    private PaymentMethodRepository repository;

    public List<PaymentMethod> getAll() {
        return repository.findAll();
    }

    public Optional<PaymentMethod> getById(Long id) {
        return repository.findById(id);
    }

    public PaymentMethod save(PaymentMethod paymentMethod) {
        return repository.save(paymentMethod);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
