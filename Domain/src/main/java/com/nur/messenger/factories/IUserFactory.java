package com.nur.messenger.factories;

import com.nur.core.BusinessRuleValidationException;
import com.nur.messenger.usuarios.Usuario;

public interface IUserFactory {
    Usuario createUSer(String username, String email, String accountType, String password) throws BusinessRuleValidationException;
}
