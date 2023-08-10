package com.nur.command.users.create;

import an.awesome.pipelinr.Command;
import com.nur.core.BusinessRuleValidationException;
import com.nur.dto.UserDTO;
import com.nur.messenger.factories.IUserFactory;
import com.nur.messenger.usuarios.Usuario;
import com.nur.repositories.IUserRepository;
import com.nur.util.UserMapper;
import org.springframework.stereotype.Component;

@Component
public class CreateUserHandler implements Command.Handler<CreateUSerCommand, UserDTO> {

    private final IUserRepository userRepository;

    private final IUserFactory userFactory;

    public CreateUserHandler(IUserRepository userRepository, IUserFactory userFactory) {
        this.userRepository = userRepository;
        this.userFactory = userFactory;
    }

    @Override
    public UserDTO handle(CreateUSerCommand createUSerCommand) {
        Usuario user = null;
        try {
            user = userFactory.createUSer(createUSerCommand.userDTO.getUserName(), createUSerCommand.userDTO.getEmail(), createUSerCommand.userDTO.getAccountType(), createUSerCommand.userDTO.getPassword());
            if(user == null){
                return null;
            }
            userRepository.update(user);
            return UserMapper.from(user);
        } catch (BusinessRuleValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
