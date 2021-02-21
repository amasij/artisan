package com.artisan.artisan.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="states")
public class State {
    private @Id
    @GeneratedValue(strategy= GenerationType.AUTO) Long id;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private String code;

    @OneToOne
    @JoinColumn(name = "country", nullable = false)
    private Country country;

    @Column(nullable=false)
    @Enumerated(EnumType.STRING)
    private EntityStatusConstant status;


}
