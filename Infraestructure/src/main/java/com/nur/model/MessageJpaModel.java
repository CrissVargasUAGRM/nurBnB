package com.nur.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Messages")
public class MessageJpaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_MESSAGE", nullable = false)
    private UUID id;

    @Column(nullable = false, name = "DESCRIPTION")
    private String description;

    @ManyToOne
    private UserJpaModel user;

    @ManyToOne
    private ConversationJpaModel conversation;
}
