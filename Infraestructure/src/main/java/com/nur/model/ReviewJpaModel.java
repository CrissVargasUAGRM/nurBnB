package com.nur.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Review")
@Getter
@Setter
public class ReviewJpaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_REVIEW", nullable = false)
    private UUID id;

    @Column(name = "COMMEND_VALUE", nullable = false)
    private String commendValue;

    @Column(nullable = false, name = "VALORATION")
    private int valoration;

    @Column(name = "COMMEND", nullable = false)
    private String commend;

    @Column(name = "PROPERTY", nullable = false)
    private String property;

    @Column(nullable = false, name = "USERID")
    private UUID userId;
}
