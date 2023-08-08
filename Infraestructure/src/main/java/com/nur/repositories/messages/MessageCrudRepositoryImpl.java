package com.nur.repositories.messages;

import com.nur.messenger.conversacion.Messages;
import com.nur.messenger.factories.IMessageFactory;
import com.nur.model.MessageJpaModel;
import com.nur.utils.MessageUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class MessageCrudRepositoryImpl implements IMessageFactory {

    @Autowired
    private IMessageCrudRepository messageCrudRepository;

    @Override
    public Messages saveMessage(UUID userId, String content, UUID conversationId) {
        Messages message = new Messages(userId, content, conversationId);
        MessageJpaModel model = MessageUtils.messageToJpaEntity(message);
        messageCrudRepository.save(model);
        return message;
    }
}
