package com.nur.repositories.messages;

import com.nur.model.Messages;
import com.nur.model.MessageJpaModel;
import com.nur.repositories.IMessageRepository;
import com.nur.utils.MessageUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class MessageCrudRepositoryImpl implements IMessageRepository {

    @Autowired
    private IMessageCrudRepository messageCrudRepository;

    @Override
    public UUID update(Messages message) {
        Messages messages = new Messages(message.getUserId(), message.getDescription(), message.getConversacionId());
        MessageJpaModel model = MessageUtils.messageToJpaEntity(messages);
        messageCrudRepository.save(model);
        return messageCrudRepository.save(model).getId();
    }

    @Override
    public Messages getById(UUID id) {
        try {
            return MessageUtils.jpaToEntityMessage(messageCrudRepository.findById(id).orElse(null));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
