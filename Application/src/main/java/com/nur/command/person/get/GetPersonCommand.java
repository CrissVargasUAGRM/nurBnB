package com.nur.command.person.get;

import an.awesome.pipelinr.Command;
import com.nur.dto.PersonDTO;
import lombok.Getter;

@Getter
public class GetPersonCommand implements Command<PersonDTO> {
    String personId;

    public GetPersonCommand(String personId) {
        this.personId = personId;
    }
}
