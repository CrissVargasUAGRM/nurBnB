package com.nur.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "Conversations")
@Getter
@Setter
public class ConversationJpaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CONVERSATION", nullable = false)
    private UUID id;

    @Column(nullable = false, name = "INITIAL_DATE")
    private LocalDate initialDate;

    @Column(nullable = false, name = "FINAL_DATE")
    private LocalDate finalDate;

    @Column(nullable = false, name = "STATUS")
    private String status;

}
