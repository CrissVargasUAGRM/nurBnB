package com.nur.command.conversation.create;

import an.awesome.pipelinr.Command;
import com.nur.dto.ConversationDTO;
import com.nur.model.Conversacion;
import com.nur.factories.conversation.IConversationFactory;
import com.nur.repositories.IConversationRepository;
import com.nur.util.ConversationMapper;
import org.springframework.stereotype.Component;

@Component
public class CreateConversationHandler implements Command.Handler<CreateConversationCommand, ConversationDTO>{
    private final IConversationRepository conversationRepository;

    private final IConversationFactory conversationFactory;

    public CreateConversationHandler(IConversationRepository conversationRepository, IConversationFactory conversationFactory) {
        this.conversationRepository = conversationRepository;
        this.conversationFactory = conversationFactory;
    }

    @Override
    public ConversationDTO handle(CreateConversationCommand createConversationCommand) {
        Conversacion conversation = null;
        try {
            conversation = conversationFactory.createConversation("ok");
            if(conversation == null){
                return null;
            }
            conversationRepository.update(conversation);
            return ConversationMapper.from(conversation);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
