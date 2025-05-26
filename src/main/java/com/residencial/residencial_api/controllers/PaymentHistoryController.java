package com.residencial.residencial_api.controllers;

import com.residencial.residencial_api.entities.PaymentHistory;
import com.residencial.residencial_api.services.IPaymentHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;


@RestController
@RequestMapping("/api/payment-history")
public class PaymentHistoryController {

    @Autowired
    private IPaymentHistory service;

    @GetMapping
    public List<PaymentHistory> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<PaymentHistory> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public PaymentHistory create(@RequestBody PaymentHistory paymentHistory) {
        return service.save(paymentHistory);
    }

    @PutMapping("/{id}")
    public PaymentHistory update(@PathVariable Long id, @RequestBody PaymentHistory paymentHistory) {
        paymentHistory.setId(id);
        return service.save(paymentHistory);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
