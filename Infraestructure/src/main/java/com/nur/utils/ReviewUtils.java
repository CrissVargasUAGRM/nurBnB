package com.nur.utils;

import com.nur.core.BusinessRuleValidationException;
import com.nur.model.ReviewJpaModel;
import com.nur.rewiev.Commend;

public class ReviewUtils {
    public static ReviewJpaModel reviewToJpaEntity(Commend review){
        ReviewJpaModel model = new ReviewJpaModel();
        model.setValoration(review.getPoints());
        model.setCommend(review.getComentario());
        return model;
    }

    public static Commend jpaToReviewJpaModel(ReviewJpaModel jpaModel) throws BusinessRuleValidationException {
        return new Commend(jpaModel.getUserId(), jpaModel.getCommendValue(), jpaModel.getCommend(), jpaModel.getProperty(), jpaModel.getValoration());
    }
}
