package com.nur.command.conversation.create;

import an.awesome.pipelinr.Command;
import com.nur.dto.ConversationDTO;

public class CreateConversationCommand implements Command<ConversationDTO> {
    ConversationDTO conversationDTO;

    public CreateConversationCommand(ConversationDTO conversationDTO) {
        this.conversationDTO = conversationDTO;
    }
}
