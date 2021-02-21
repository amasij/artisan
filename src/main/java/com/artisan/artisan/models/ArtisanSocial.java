package com.artisan.artisan.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ArtisanSocial")
public class ArtisanSocial {
    private @Id
    @GeneratedValue(strategy= GenerationType.AUTO) Long id;

    @OneToOne
    @JoinColumn(name = "artisan", nullable = false)
    private Artisan artisan;

    @Column
    private String instagram;

    @Column
    private String twitter;

    @Column
    private String facebook;

    @Column
    private String website;

    @Column
    private String whatsapp;

}
