package com.residencial.residencial_api.services;

import com.residencial.residencial_api.entities.PaymentHistory;
import java.util.*;

public interface IPaymentHistory {

    List<PaymentHistory> getAll();
    Optional<PaymentHistory> getById(Long id);
    PaymentHistory save(PaymentHistory paymentHistory);
    void delete(Long id);

}
