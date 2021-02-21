package com.artisan.artisan.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="country")
public class Country {
    private @Id
    @GeneratedValue(strategy= GenerationType.AUTO) Long id;

    @Column(nullable=false,unique = true)
    private String name;

    @Column(nullable=false, unique = true)
    private String code;

    @Column(nullable=false)
    private Boolean supported;

    @Column(nullable=false)
    @Enumerated(EnumType.STRING)
    private EntityStatusConstant status;
}
