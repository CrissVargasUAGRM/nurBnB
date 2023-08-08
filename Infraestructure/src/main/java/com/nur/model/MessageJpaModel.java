package com.nur.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Messages")
@Getter
@Setter
public class MessageJpaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_MESSAGE", nullable = false)
    private UUID id;

    @Column(nullable = false, name = "DESCRIPTION")
    private String description;

    @Column(nullable = false, name = "USERID")
    private UUID userId;

    @Column(nullable = false, name = "CONVERSATIONID")
    private UUID conversationId;

}
