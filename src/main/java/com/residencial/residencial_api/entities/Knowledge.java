package com.residencial.residencial_api.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Knowledge")
public class Knowledge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "House_ID", nullable = false)
    private Houses house;

    @ManyToOne
    @JoinColumn(name = "FundingRequest_ID", nullable = false)
    private FundingRequest fundingRequest;

}
