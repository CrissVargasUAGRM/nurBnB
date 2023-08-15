package com.nur.util;

import com.nur.dto.MessageDTO;
import com.nur.model.Messages;

import java.util.UUID;

public class MessageMapper {
    public static MessageDTO from(Messages message){
        if(message == null) return MessageDTO.builder().build();
        return MessageDTO.builder()
                .userId(message.getUserId().toString())
                .description(message.getDescription())
                .conversationId(message.getConversacionId().toString())
                .build();
    }

    public static Messages from(MessageDTO message){
        return Messages.builder()
                .userId(UUID.fromString(message.getUserId()))
                .description(message.getDescription())
                .conversacionId(UUID.fromString(message.getConversationId()))
                .build();
    }
}
