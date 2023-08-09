package com.nur.repositories;

import com.nur.messenger.personas.Personas;

import java.util.UUID;

public interface IPersonRepository {
    UUID update(Personas person);
    Personas getById(UUID id);
}
