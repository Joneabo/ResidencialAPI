package com.residencial.residencial_api.repositories;

import com.residencial.residencial_api.entities.PaymentHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaymentHistoryRepository extends JpaRepository<PaymentHistory, Long> {
    // Custom query methods can be defined here if needed

}
