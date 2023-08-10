package com.nur.command.users.get;

import an.awesome.pipelinr.Command;
import com.nur.dto.UserDTO;
import lombok.Getter;

@Getter
public class GetUserCommand implements Command<UserDTO> {
    String userId;

    public GetUserCommand(String userId) {
        this.userId = userId;
    }
}
