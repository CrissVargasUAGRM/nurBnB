package com.nur.controllers;

import an.awesome.pipelinr.Pipeline;
import com.nur.command.message.create.CreateMessageCommand;
import com.nur.dto.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {
    final Pipeline pipeline;

    @Autowired
    public MessageController(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    @PostMapping("/")
    public MessageDTO createMessage(@RequestBody MessageDTO message){
        CreateMessageCommand messageCommand = new CreateMessageCommand(message);
        return messageCommand.execute(pipeline);
    }
}
