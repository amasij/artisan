package com.artisan.artisan.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="GPSCoordinates")
public class GPSCoordinate {

    private @Id
    @GeneratedValue(strategy= GenerationType.AUTO) Long id;

    private Double latitude;

    private Double longitude;

    @Column(nullable=false)
    @Enumerated(EnumType.STRING)
    private EntityStatusConstant status;
}
