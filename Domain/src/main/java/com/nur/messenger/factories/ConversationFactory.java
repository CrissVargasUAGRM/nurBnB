package com.nur.messenger.factories;


import com.nur.messenger.conversacion.Conversacion;

public class ConversationFactory implements IConversationFactory{
    @Override
    public Conversacion createConversation(String status) {
        return new Conversacion();
    }
}
