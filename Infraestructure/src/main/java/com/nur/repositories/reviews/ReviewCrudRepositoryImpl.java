package com.nur.repositories.reviews;

import com.nur.core.BusinessRuleValidationException;
import com.nur.messenger.factories.ICommendFactory;
import com.nur.model.ReviewJpaModel;
import com.nur.rewiev.Commend;
import com.nur.utils.ReviewUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class ReviewCrudRepositoryImpl implements ICommendFactory {
    @Autowired
    private IReviewCrudRepository reviewCrudRepository;

    @Override
    public Commend saveCommend(UUID userId, String comment, String valoration, String ownProperty, int points) throws BusinessRuleValidationException {
        Commend review = new Commend(userId, valoration, comment, ownProperty, points);
        ReviewJpaModel model = ReviewUtils.reviewToJpaEntity(review);
        reviewCrudRepository.save(model);
        return review;
    }
}
