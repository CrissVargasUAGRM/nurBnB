package com.nur.repositories.conversations;

import com.nur.messenger.conversacion.Conversacion;
import com.nur.messenger.factories.IConversationFactory;
import com.nur.model.ConversationJpaModel;
import com.nur.repositories.IConversationRepository;
import com.nur.utils.ConversationUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class ConversationCrudRepositoryImpl implements IConversationRepository {

    @Autowired
    private IConversationCrudRepository conversationCrudRepository;

    @Override
    public UUID update(Conversacion conversation) {
        ConversationJpaModel model = ConversationUtils.conversationToJpaEntity(conversation);
        conversationCrudRepository.save(model);
        return conversationCrudRepository.save(model).getId();
    }

    @Override
    public Conversacion getById(UUID id) {
        try {
            return ConversationUtils.jpaToConversation(conversationCrudRepository.findById(id).orElse(null));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
