package com.artisan.artisan.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Table(name="Artisan")
public class Artisan {
    private @Id
    @GeneratedValue(strategy= GenerationType.AUTO) Long id;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private Date dateCreated;

    @Column(nullable=false)
    private String description;

    @Column(nullable=false,unique = true)
    private String email;

    @Column(nullable=false, unique = true)
    private String phoneNumber;

    @Column(unique = true)
    private String alternatePhoneNumber;

    @Column(nullable=false)
    private Boolean verified;

    @Column(nullable=false,unique = true)
    private String rcNumber;

    @OneToOne
    @JoinColumn(name = "address", nullable = false)
    private Address address;

    @Column(nullable=false)
    @Enumerated(EnumType.STRING)
    private EntityStatusConstant status;

    @Column(nullable=false)
    @Enumerated(EnumType.STRING)
    private ApprovalStatusConstant approvalStatus;

    @OneToOne
    @JoinColumn(name = "logo")
    private ImageFile logo;
}
