package com.nur.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@Setter
public class PersonDTO {
    public String name;
    public String lastName;
    public String ci;
    public String userId;
}
