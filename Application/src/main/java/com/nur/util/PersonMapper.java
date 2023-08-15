package com.nur.util;

import com.nur.dto.PersonDTO;
import com.nur.model.Personas;

import java.util.UUID;

public class PersonMapper {
    public static PersonDTO from(Personas person){
        if(person == null) return PersonDTO.builder().build();
        return PersonDTO.builder()
                .name(person.getName())
                .lastName(person.getLastName())
                .ci(person.getCi())
                .userId(person.getUserId().toString())
                .build();
    }

    public static Personas from(PersonDTO person){
        return Personas.builder()
                .name(person.getName())
                .lastName(person.getLastName())
                .ci(person.getCi())
                .userId(UUID.fromString(person.getUserId()))
                .build();
    }
}
