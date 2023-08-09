package com.nur.repositories;

import com.nur.core.BusinessRuleValidationException;
import com.nur.messenger.conversacion.Conversacion;
import com.nur.rewiev.Commend;

import java.util.UUID;

public interface ICommendRepository {
    UUID update(Commend commend) throws BusinessRuleValidationException;
    Commend getById(UUID id);
}
