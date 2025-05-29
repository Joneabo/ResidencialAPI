package com.residencial.residencial_api.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "houses")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Houses {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "Dimensions", nullable = false)
    private String dimensions;

    @Column(name = "Price")
    private Double price;

    @Column(name = "rentallowed")
    private boolean rentAllowed;

    @ManyToOne
    @JoinColumn(name = "Urbanization_ID", nullable = false)
    private Urbanization urbanizationId;

    @Column(name = "Available")
    private boolean available;

    @Column(name = "ImageURL")
    private String imageURL;
    
}
