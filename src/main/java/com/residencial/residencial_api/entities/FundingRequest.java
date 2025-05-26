package com.residencial.residencial_api.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "fundingrequest")
public class FundingRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ClientID", nullable = false)
    private Client client;

    @Column(name = "FundingName", nullable = false)
    private String fundingName;

    @Column(name = "QuantityAsked", nullable = false)
    private Double quantityAsked;

    @Column(name = "IncomeDocumentation", nullable = false)
    private String incomeDocumentation;

    @Column(name = "AdditionalDocuments")
    private String additionalDocuments;

    @Column(name = "InterestRate", nullable = false)
    private Double interestRate;

    @Column(name = "QuantityToPay", nullable = false)
    private Double quantityToPay;

    @Column(name = "DateAsked", nullable = false)
    private LocalDate dateAsked;

    @Column(name = "Status", nullable = false)
    private Boolean status;

    


}
