package com.nur.messenger.factories;


import com.nur.messenger.conversacion.Conversacion;

public interface IConversationFactory {
    Conversacion createConversation(String status);
}
