package com.nur.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@Setter
public class ReviewDTO {
    public String userId;
    public String valoration;
    public String commend;
    public String property;
    public int points;
}
