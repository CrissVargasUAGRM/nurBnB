package com.nur.repositories;

import com.nur.messenger.conversacion.Conversacion;

import java.util.UUID;

public interface IConversationRepository {
    UUID update(Conversacion conversation);
    Conversacion getById(UUID id);
}
