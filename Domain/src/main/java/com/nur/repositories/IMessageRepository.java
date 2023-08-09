package com.nur.repositories;

import com.nur.messenger.conversacion.Messages;

import java.util.UUID;

public interface IMessageRepository {
    UUID update(Messages message);
    Messages getById(UUID id);
}
