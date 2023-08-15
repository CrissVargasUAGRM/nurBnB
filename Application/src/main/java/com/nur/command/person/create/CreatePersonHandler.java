package com.nur.command.person.create;

import an.awesome.pipelinr.Command;
import com.nur.dto.PersonDTO;
import com.nur.factories.persons.IPersonaFactory;
import com.nur.model.Personas;
import com.nur.repositories.IPersonRepository;
import com.nur.util.PersonMapper;

import java.util.UUID;

public class CreatePersonHandler implements Command.Handler<CreatePersonCommand, PersonDTO> {

    private final IPersonRepository personRepository;

    private final IPersonaFactory personaFactory;

    public CreatePersonHandler(IPersonRepository personRepository, IPersonaFactory personaFactory) {
        this.personRepository = personRepository;
        this.personaFactory = personaFactory;
    }

    @Override
    public PersonDTO handle(CreatePersonCommand createPersonCommand) {
        Personas persona = null;
        try {
            persona = personaFactory.createPerson(createPersonCommand.personDTO.getName(), createPersonCommand.personDTO.getLastName(), createPersonCommand.personDTO.getCi(), UUID.fromString(createPersonCommand.personDTO.getUserId()));
            if(persona == null){
                return null;
            }
            personRepository.update(persona);
            return PersonMapper.from(persona);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
