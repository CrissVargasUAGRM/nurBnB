package com.nur.util;

import com.nur.core.BusinessRuleValidationException;
import com.nur.dto.UserDTO;
import com.nur.model.EmailValueObject;
import com.nur.model.PasswordValueObject;
import com.nur.model.Usuario;

public class UserMapper {
    public static UserDTO from(Usuario user){
        if(user == null) return UserDTO.builder().build();
        return UserDTO.builder()
                .userName(user.getUsername())
                .accountType(user.getAccountType())
                .email(user.getEmail())
                .password(user.getPass())
                .build();
    }

    public static Usuario from(UserDTO user) throws BusinessRuleValidationException {
        Usuario users = new Usuario();
        users.setUsername(user.getUserName());
        users.setAccountType(user.getAccountType());
        users.setEmail(new EmailValueObject(user.getEmail()));
        users.setPass(new PasswordValueObject(user.getPassword()));
        return users;
    }
}
