package com.nur.repositories.conversations;

import com.nur.messenger.conversacion.Conversacion;
import com.nur.messenger.factories.IConversationFactory;
import com.nur.model.ConversationJpaModel;
import com.nur.utils.ConversationUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class ConversationCrudRepositoryImpl implements IConversationFactory {

    @Autowired
    private IConversationCrudRepository conversationCrudRepository;

    @Override
    public Conversacion createConversation(String status) {
        Conversacion conversacion = new Conversacion();
        ConversationJpaModel model = ConversationUtils.conversationToJpaEntity(conversacion);
        conversationCrudRepository.save(model);
        return conversacion;
    }
}
