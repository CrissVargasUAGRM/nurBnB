package com.nur.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@Setter
public class UserDTO {
    public String userName;
    public String accountType;
    public String email;
    public String password;
}
