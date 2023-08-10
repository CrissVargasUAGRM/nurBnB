package com.nur.command.message.create;

import an.awesome.pipelinr.Command;
import com.nur.dto.MessageDTO;

public class CreateMessageCommand implements Command<MessageDTO> {
    MessageDTO messageDTO;

    public CreateMessageCommand(MessageDTO messageDTO) {
        this.messageDTO = messageDTO;
    }
}
