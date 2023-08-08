package com.nur.repositories.conversations;

import com.nur.model.ConversationJpaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IConversationCrudRepository extends JpaRepository<ConversationJpaModel, UUID> {
}
