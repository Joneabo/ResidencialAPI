package com.residencial.residencial_api.entities;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FundingJourney")
public class FundingJourney {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Client_ID", nullable = false)
    private Client client;

    @Column(name = "TotalFunding", nullable = false)
    private Double totalFunding;

    @Column(name = "CurrentFundingPaid", nullable = false)
    private Double currentFundingPaid;

    @Column(name = "AcumulatedInterest", nullable = false)
    private Double accumulatedInterest;

    @Column(name = "LastDatePaid", nullable = false)
    private LocalDate lastDatePaid;

    @Column(name = "History_ID", nullable = false)
    private Long historyId;

}
