package com.nur.repositories.messages;

import com.nur.model.MessageJpaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IMessageCrudRepository extends JpaRepository<MessageJpaModel, UUID> {
}
