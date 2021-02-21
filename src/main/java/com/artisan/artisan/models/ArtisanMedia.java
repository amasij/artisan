package com.artisan.artisan.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="ArtisanMedia")
public class ArtisanMedia {
    private @Id
    @GeneratedValue(strategy= GenerationType.AUTO) Long id;

    @OneToOne
    @JoinColumn(name = "artisan", nullable = false)
    private Artisan artisan;

    @OneToOne
    @JoinColumn(name = "file", nullable = false)
    private ImageFile file;

    @Column(nullable=false)
    @Enumerated(EnumType.STRING)
    private MediaTypeConstant mediaType;

    @Column(nullable=false)
    @Enumerated(EnumType.STRING)
    private EntityStatusConstant status;
}
