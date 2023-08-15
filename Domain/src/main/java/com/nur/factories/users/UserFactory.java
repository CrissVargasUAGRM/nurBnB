package com.nur.factories.users;


import com.nur.core.BusinessRuleValidationException;
import com.nur.model.Usuario;

public class UserFactory implements IUserFactory{
    @Override
    public Usuario createUSer(String username, String email, String accountType, String password) throws BusinessRuleValidationException {
        return new Usuario(username, accountType, email, password);
    }
}
