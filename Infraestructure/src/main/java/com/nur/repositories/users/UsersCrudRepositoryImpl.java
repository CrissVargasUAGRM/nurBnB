package com.nur.repositories.users;

import com.nur.core.BusinessRuleValidationException;
import com.nur.messenger.factories.IUserFactory;
import com.nur.messenger.usuarios.Usuario;
import com.nur.model.UserJpaModel;
import com.nur.utils.UsersUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersCrudRepositoryImpl implements IUserFactory {

    @Autowired
    private IUsersCrudRepository usersCrudRepository;

    @Override
    public Usuario createUSer(String username, String email, String accountType, String password) throws BusinessRuleValidationException {
        Usuario user = new Usuario(username, accountType, email, password);
        UserJpaModel model = UsersUtils.userToJpaEntity(user);
        usersCrudRepository.save(model);
        return user;
    }
}
