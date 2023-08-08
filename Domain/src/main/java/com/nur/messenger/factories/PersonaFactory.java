package com.nur.messenger.factories;


import com.nur.messenger.personas.Personas;

import java.util.UUID;

public class PersonaFactory implements IPersonaFactory{
    @Override
    public Personas createPerson(String name, String lastName, String ci, UUID userId) {
        return new Personas(name, lastName, ci, userId);
    }
}
