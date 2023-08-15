package com.nur.util;

import com.nur.core.BusinessRuleValidationException;
import com.nur.dto.ReviewDTO;
import com.nur.model.Commend;
import com.nur.valueObjects.ValorationValueObject;

import java.util.UUID;

public class ReviewMapper {
    public static ReviewDTO from(Commend review){
        if(review == null) return ReviewDTO.builder().build();
        return ReviewDTO.builder()
                .userId(review.getUserId().toString())
                .valoration(review.getValoracion())
                .commend(review.getComentario())
                .property(review.getPropiedad())
                .points(review.getPoints())
                .build();
    }

    public static Commend from(ReviewDTO review) throws BusinessRuleValidationException {
        return Commend.builder()
                .userId(UUID.fromString(review.getUserId()))
                .valoracion(review.getValoration())
                .comentario(review.getCommend())
                .propiedad(review.getProperty())
                .points(new ValorationValueObject(review.getPoints()))
                .build();
    }
}
