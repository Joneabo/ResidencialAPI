package com.residencial.residencial_api.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PaymentHistory")
public class PaymentHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CurrentPayment")
    private Double currentPayment;

    @ManyToOne
    @JoinColumn(name = "PaymentMethod", nullable = false)
    private PaymentMethod paymentMethod;

    @Column(name = "DatePaid")
    private LocalDate datePaid;

}
