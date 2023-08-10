package com.nur.controllers;

import an.awesome.pipelinr.Pipeline;
import com.nur.command.person.create.CreatePersonCommand;
import com.nur.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class PersonController {
    final Pipeline pipeline;

    @Autowired
    public PersonController(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    @PostMapping("/")
    public PersonDTO createPerson(@RequestBody PersonDTO personDTO){
        CreatePersonCommand personCommand = new CreatePersonCommand(personDTO);
        return personCommand.execute(pipeline);
    }
}
