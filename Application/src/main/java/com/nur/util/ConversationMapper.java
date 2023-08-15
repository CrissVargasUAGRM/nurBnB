package com.nur.util;

import com.nur.dto.ConversationDTO;
import com.nur.model.Conversacion;

public class ConversationMapper {
    public static ConversationDTO from(Conversacion conversation){
        if(conversation == null) return ConversationDTO.builder().build();
        return ConversationDTO.builder()
                .reference(conversation.getStatus().name())
                .build();
    }

    public static Conversacion from(ConversationDTO conversationDTO){
        return new Conversacion();
    }
}
