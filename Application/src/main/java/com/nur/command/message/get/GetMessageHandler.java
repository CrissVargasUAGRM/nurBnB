package com.nur.command.message.get;

import an.awesome.pipelinr.Command;
import com.nur.dto.MessageDTO;
import com.nur.model.Messages;
import com.nur.factories.messages.IMessageFactory;
import com.nur.repositories.IMessageRepository;
import com.nur.util.MessageMapper;

import java.util.UUID;

public class GetMessageHandler implements Command.Handler<GetMessageCommand, MessageDTO> {

    private final IMessageRepository messageRepository;

    private final IMessageFactory messageFactory;

    public GetMessageHandler(IMessageRepository messageRepository, IMessageFactory messageFactory) {
        this.messageRepository = messageRepository;
        this.messageFactory = messageFactory;
    }

    @Override
    public MessageDTO handle(GetMessageCommand getMessageCommand) {
        Messages message = messageRepository.getById(UUID.fromString(getMessageCommand.messageId));
        if(message == null){
            return null;
        }
        return MessageMapper.from(message);
    }
}
