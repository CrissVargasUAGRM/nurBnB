package com.nur.utils;

import com.nur.model.Messages;
import com.nur.model.MessageJpaModel;

public class MessageUtils {
    public static MessageJpaModel messageToJpaEntity(Messages message){
        MessageJpaModel model = new MessageJpaModel();
        model.setDescription(message.getDescription());
        model.setUserId(message.getUserId());
        model.setConversationId(message.getConversacionId());
        return model;
    }

    public static Messages jpaToEntityMessage(MessageJpaModel jpaMessage){
        return new Messages(
                jpaMessage.getUserId(),
                jpaMessage.getDescription(),
                jpaMessage.getConversationId()
        );
    }
}
