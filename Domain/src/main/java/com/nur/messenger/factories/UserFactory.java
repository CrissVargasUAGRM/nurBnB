package com.nur.messenger.factories;


import com.nur.core.BusinessRuleValidationException;
import com.nur.messenger.usuarios.Usuario;

public class UserFactory implements IUserFactory{
    @Override
    public Usuario createUSer(String username, String email, String accountType, String password) throws BusinessRuleValidationException {
        return new Usuario(username, accountType, email, password);
    }
}
