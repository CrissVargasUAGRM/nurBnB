package com.nur.repositories.users;

import com.nur.core.BusinessRuleValidationException;
import com.nur.messenger.factories.IUserFactory;
import com.nur.messenger.usuarios.Usuario;
import com.nur.model.UserJpaModel;
import com.nur.repositories.IUserRepository;
import com.nur.utils.UsersUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.UUID;

@Service
public class UsersCrudRepositoryImpl implements IUserRepository {

    @Autowired
    private IUsersCrudRepository usersCrudRepository;

    @Override
    public UUID update(Usuario user) throws BusinessRuleValidationException {
        Usuario users = new Usuario(user.getUsername(), user.getAccountType(), user.getEmail(), user.getPass());
        UserJpaModel model = UsersUtils.userToJpaEntity(users);
        usersCrudRepository.save(model);
        return usersCrudRepository.save(model).getId();
    }

    @Override
    public Usuario getById(UUID id) {
        try {
            return UsersUtils.jpaToUserJpaModel(Objects.requireNonNull(usersCrudRepository.findById(id).orElse(null)));
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
