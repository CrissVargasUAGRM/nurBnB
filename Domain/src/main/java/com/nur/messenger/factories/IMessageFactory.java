package com.nur.messenger.factories;


import com.nur.messenger.conversacion.Messages;

import java.util.UUID;

public interface IMessageFactory {
    Messages saveMessage(UUID userId, String content, UUID conversationId);
}
