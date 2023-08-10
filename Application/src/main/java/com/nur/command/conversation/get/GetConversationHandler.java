package com.nur.command.conversation.get;

import an.awesome.pipelinr.Command;
import com.nur.dto.ConversationDTO;
import com.nur.messenger.conversacion.Conversacion;
import com.nur.messenger.factories.IConversationFactory;
import com.nur.repositories.IConversationRepository;
import com.nur.util.ConversationMapper;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class GetConversationHandler implements Command.Handler<GetConversationCommand, ConversationDTO> {

    private final IConversationRepository conversationRepository;

    private final IConversationFactory conversationFactory;

    public GetConversationHandler(IConversationRepository conversationRepository, IConversationFactory conversationFactory) {
        this.conversationRepository = conversationRepository;
        this.conversationFactory = conversationFactory;
    }

    @Override
    public ConversationDTO handle(GetConversationCommand getConversationCommand) {
        Conversacion conversacion = conversationRepository.getById(UUID.fromString(getConversationCommand.getConversationId()));
        if(conversacion == null){
            return null;
        }
        return ConversationMapper.from(conversacion);
    }
}
