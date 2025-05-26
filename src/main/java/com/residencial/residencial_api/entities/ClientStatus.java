package com.residencial.residencial_api.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "ClientStatus")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ClientStatus {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "StatusName" , nullable = false)
    private String status;

}
