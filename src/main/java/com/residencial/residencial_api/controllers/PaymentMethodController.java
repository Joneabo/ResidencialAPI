package com.residencial.residencial_api.controllers;

import com.residencial.residencial_api.entities.PaymentMethod;
import com.residencial.residencial_api.services.IPaymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/payment-methods")
public class PaymentMethodController {

  @Autowired
    private IPaymentMethod service;

    @GetMapping
    public List<PaymentMethod> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<PaymentMethod> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public PaymentMethod create(@RequestBody PaymentMethod paymentMethod) {
        return service.save(paymentMethod);
    }

    @PutMapping("/{id}")
    public PaymentMethod update(@PathVariable Long id, @RequestBody PaymentMethod paymentMethod) {
        paymentMethod.setId(id);
        return service.save(paymentMethod);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
