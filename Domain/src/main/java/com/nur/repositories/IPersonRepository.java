package com.nur.repositories;

import com.nur.model.Personas;

import java.util.UUID;

public interface IPersonRepository {
    UUID update(Personas person);
    Personas getById(UUID id);
}
