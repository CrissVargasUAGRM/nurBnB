package com.nur.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@Setter
public class MessageDTO {
    public String userId;
    public String description;
    public String conversationId;
}
