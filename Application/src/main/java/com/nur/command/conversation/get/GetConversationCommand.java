package com.nur.command.conversation.get;

import an.awesome.pipelinr.Command;
import com.nur.dto.ConversationDTO;
import lombok.Getter;

@Getter
public class GetConversationCommand implements Command<ConversationDTO> {
    String conversationId;

    public GetConversationCommand(String conversationId) {
        this.conversationId = conversationId;
    }
}
