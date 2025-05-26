package com.residencial.residencial_api.repositories;

import com.residencial.residencial_api.entities.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {
    // Custom query methods can be defined here if needed

}
