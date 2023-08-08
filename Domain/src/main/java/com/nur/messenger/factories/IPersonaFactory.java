package com.nur.messenger.factories;

import com.nur.messenger.personas.Personas;

import java.util.UUID;

public interface IPersonaFactory {
    Personas createPerson(String name, String lastName, String ci, UUID userId);
}
