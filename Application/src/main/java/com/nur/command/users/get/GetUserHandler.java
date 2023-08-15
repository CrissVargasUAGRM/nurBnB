package com.nur.command.users.get;

import an.awesome.pipelinr.Command;
import com.nur.dto.UserDTO;
import com.nur.factories.users.IUserFactory;
import com.nur.model.Usuario;
import com.nur.repositories.IUserRepository;
import com.nur.util.UserMapper;

import java.util.UUID;

public class GetUserHandler implements                                     Command.Handler<GetUserCommand, UserDTO> {

    private final IUserRepository userRepository;

    private final IUserFactory userFactory;

    public GetUserHandler(IUserRepository userRepository, IUserFactory userFactory) {
        this.userRepository = userRepository;
        this.userFactory = userFactory;
    }

    @Override
    public UserDTO handle(GetUserCommand getUserCommand) {
        Usuario user = userRepository.getById(UUID.fromString(getUserCommand.getUserId()));
        if(user == null){
            return null;
        }
        return UserMapper.from(user);
    }
}
