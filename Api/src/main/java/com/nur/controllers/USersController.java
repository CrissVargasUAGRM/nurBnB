package com.nur.controllers;

import an.awesome.pipelinr.Pipeline;
import com.nur.command.users.create.CreateUSerCommand;
import com.nur.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class USersController {
    final Pipeline pipeline;

    @Autowired
    public USersController(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    @PostMapping("/")
    public UserDTO createUser(@RequestBody UserDTO user){
        CreateUSerCommand userCommand = new CreateUSerCommand(user);
        return userCommand.execute(pipeline);
    }
}
