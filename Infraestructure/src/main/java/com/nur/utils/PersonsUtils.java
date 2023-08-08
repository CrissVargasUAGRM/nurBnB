package com.nur.utils;

import com.nur.messenger.personas.Personas;
import com.nur.model.PersonaJpaModel;

public class PersonsUtils {
    public static PersonaJpaModel personToJpaEntity(Personas person){
        PersonaJpaModel model = new PersonaJpaModel();
        model.setName(person.getName());
        model.setLastName(person.getLastName());
        model.setCi(person.getCi());
        model.setUserId(person.getUserId());
        return model;
    }

    public static Personas jpaToPersons(PersonaJpaModel jpaModel){
        return new Personas(
                jpaModel.getName(),
                jpaModel.getLastName(),
                jpaModel.getCi(),
                jpaModel.getUserId()
        );
    }
}
