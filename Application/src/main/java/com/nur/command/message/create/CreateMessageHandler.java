package com.nur.command.message.create;

import an.awesome.pipelinr.Command;
import com.nur.core.BusinessRuleValidationException;
import com.nur.dto.MessageDTO;
import com.nur.messenger.conversacion.Messages;
import com.nur.messenger.factories.IMessageFactory;
import com.nur.repositories.IMessageRepository;
import com.nur.util.MessageMapper;

import java.util.UUID;

public class CreateMessageHandler implements Command.Handler<CreateMessageCommand, MessageDTO> {

    private final IMessageRepository messageRepository;

    private final IMessageFactory messageFactory;

    public CreateMessageHandler(IMessageRepository messageRepository, IMessageFactory messageFactory) {
        this.messageRepository = messageRepository;
        this.messageFactory = messageFactory;
    }

    @Override
    public MessageDTO handle(CreateMessageCommand createMessageCommand) {
        Messages message = null;
        try {
            message = messageFactory.saveMessage(UUID.fromString(createMessageCommand.messageDTO.getUserId()), createMessageCommand.messageDTO.getDescription(), UUID.fromString(createMessageCommand.messageDTO.getConversationId()));
            if(message == null){
                return null;
            }
            messageRepository.update(message);
            return MessageMapper.from(message);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
