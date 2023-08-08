package com.nur.utils;

import com.nur.core.BusinessRuleValidationException;
import com.nur.messenger.usuarios.EmailValueObject;
import com.nur.messenger.usuarios.Usuario;
import com.nur.model.UserJpaModel;

public class UsersUtils {
    public static UserJpaModel userToJpaEntity(Usuario user){
        UserJpaModel model = new UserJpaModel();
        model.setId(user.getId());
        model.setUserName(user.getUsername());
        model.setAccountType(user.getAccountType());
        model.setEmail(user.getEmail());
        model.setPassword(user.getPass());
        return model;
    }

    public static Usuario jpaToUserJpaModel(UserJpaModel jpaModel) throws BusinessRuleValidationException {
        return new Usuario(jpaModel.getUserName(), jpaModel.getAccountType(), jpaModel.getEmail(), jpaModel.getPassword());
    }
}
