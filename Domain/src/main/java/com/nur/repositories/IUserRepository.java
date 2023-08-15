package com.nur.repositories;

import com.nur.core.BusinessRuleValidationException;
import com.nur.model.Usuario;

import java.util.UUID;

public interface IUserRepository {
    UUID update(Usuario user) throws BusinessRuleValidationException;
    Usuario getById(UUID id);
}
