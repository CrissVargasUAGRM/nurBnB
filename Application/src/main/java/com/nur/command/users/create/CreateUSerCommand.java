package com.nur.command.users.create;

import an.awesome.pipelinr.Command;
import com.nur.dto.UserDTO;

public class CreateUSerCommand implements Command<UserDTO> {
    UserDTO userDTO;

    public CreateUSerCommand(UserDTO userDTO) {
        this.userDTO = userDTO;
    }
}
