package com.nur.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Persona")
@Getter
@Setter
public class PersonaJpaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PERSON")
    private UUID id;

    @Column(nullable = false, name = "NAME")
    private String name;

    @Column(nullable = false, name = "LASTNAME")
    private String lastName;

    @Column(nullable = false, name = "CIPERSON")
    private String ci;

    @Column(nullable = false, name = "USERID")
    private UUID userId;
}
