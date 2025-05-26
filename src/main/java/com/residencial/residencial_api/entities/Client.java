package com.residencial.residencial_api.entities;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "client")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Client {

    @Id
    @Column(name = "ID", nullable = false)
    private Long id; 

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Email")
    private String email;

    @Column(name = "Birthdate")
    private LocalDate birthdate;

    @Column(name = "Status")
    private Long status;  // FK a ClientStatus (mapearlo como relación luego)

    @Column(name = "Contract")
    private String contract;
    
}
