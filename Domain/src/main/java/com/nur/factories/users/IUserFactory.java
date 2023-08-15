package com.nur.factories.users;

import com.nur.core.BusinessRuleValidationException;
import com.nur.model.Usuario;

public interface IUserFactory {
    Usuario createUSer(String username, String email, String accountType, String password) throws BusinessRuleValidationException;
}
