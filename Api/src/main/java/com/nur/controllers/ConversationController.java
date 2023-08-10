package com.nur.controllers;

import an.awesome.pipelinr.Pipeline;
import com.nur.command.conversation.create.CreateConversationCommand;
import com.nur.dto.ConversationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conversation")
public class ConversationController {
    final Pipeline pipeline;

    @Autowired
    public ConversationController(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    @PostMapping("/")
    public ConversationDTO createConversation(@RequestBody ConversationDTO conversationDTO){
        CreateConversationCommand conversation = new CreateConversationCommand(conversationDTO);
        return conversation.execute(pipeline);
    }


}
