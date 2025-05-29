package com.residencial.residencial_api.entities;

import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "urbanization")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Urbanization {

@Id
    @Column(name = "ID")
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "dimensions")
    private String dimensions;

    @Column(name = "foundation date")
    private LocalDate foundationdate;

    @Column(name = "ImageURL")
    private String imageURL;

}
