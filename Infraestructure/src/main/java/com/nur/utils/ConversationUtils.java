package com.nur.utils;

import com.nur.messenger.conversacion.Conversacion;
import com.nur.model.ConversationJpaModel;

public class ConversationUtils {
    public static ConversationJpaModel conversationToJpaEntity(Conversacion conversation){
        ConversationJpaModel model = new ConversationJpaModel();
        Conversacion conversacion = new Conversacion();
        model.setInitialDate(conversacion.getFechaInicio());
        model.setFinalDate(conversacion.getFechaFin());
        model.setStatus(conversacion.getStatus().name());
        return model;
    }

    public static Conversacion jpaToConversation(ConversationJpaModel jpaModel){
        return new Conversacion();
    }
}
