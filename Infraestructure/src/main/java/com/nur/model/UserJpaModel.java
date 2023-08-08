package com.nur.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@Setter
public class UserJpaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "ID_USER")
    private UUID id;

    @Column(nullable = false, name = "USERNAME")
    private String userName;

    @Column(nullable = false, name = "EMAIL")
    private String email;

    @Column(nullable = false, name = "PASSWORD")
    private String password;

    @Column(nullable = false, name = "ACCOUNTTYPE")
    private String accountType;

}
