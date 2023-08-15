package com.nur.repositories.reviews;

import com.nur.core.BusinessRuleValidationException;
import com.nur.model.ReviewJpaModel;
import com.nur.repositories.ICommendRepository;
import com.nur.model.Commend;
import com.nur.utils.ReviewUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;
import java.util.UUID;

public class ReviewCrudRepositoryImpl implements ICommendRepository {
    @Autowired
    private IReviewCrudRepository reviewCrudRepository;

    @Override
    public UUID update(Commend commend) throws BusinessRuleValidationException {
        Commend review = new Commend(commend.getUserId(), commend.getValoracion(), commend.getComentario(), commend.getPropiedad(), commend.getPoints());
        ReviewJpaModel model = ReviewUtils.reviewToJpaEntity(review);
        reviewCrudRepository.save(model);
        return reviewCrudRepository.save(model).getId();
    }

    @Override
    public Commend getById(UUID id) {
        try {
            return ReviewUtils.jpaToReviewJpaModel(Objects.requireNonNull(reviewCrudRepository.findById(id).orElse(null)));
        } catch (BusinessRuleValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
