package com.nur.command.message.get;

import an.awesome.pipelinr.Command;
import com.nur.dto.MessageDTO;

public class GetMessageCommand implements Command<MessageDTO> {
    String messageId;

    public GetMessageCommand(String messageId) {
        this.messageId = messageId;
    }
}
