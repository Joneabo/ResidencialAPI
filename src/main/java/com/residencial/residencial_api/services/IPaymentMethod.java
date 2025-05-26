package com.residencial.residencial_api.services;

import com.residencial.residencial_api.entities.PaymentMethod;
import java.util.*;


public interface IPaymentMethod {

    List<PaymentMethod> getAll();
    Optional<PaymentMethod> getById(Long id);
    PaymentMethod save(PaymentMethod paymentMethod);
    void delete(Long id);

}
