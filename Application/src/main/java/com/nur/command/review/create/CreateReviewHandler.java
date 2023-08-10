package com.nur.command.review.create;

import an.awesome.pipelinr.Command;
import com.nur.core.BusinessRuleValidationException;
import com.nur.dto.ReviewDTO;
import com.nur.messenger.factories.ICommendFactory;
import com.nur.repositories.ICommendRepository;
import com.nur.rewiev.Commend;
import com.nur.util.PersonMapper;
import com.nur.util.ReviewMapper;

import java.util.UUID;

public class CreateReviewHandler implements Command.Handler<CreateReviewCommand, ReviewDTO> {

    private final ICommendRepository commendRepository;

    private final ICommendFactory commendFactory;

    public CreateReviewHandler(ICommendRepository commendRepository, ICommendFactory commendFactory) {
        this.commendRepository = commendRepository;
        this.commendFactory = commendFactory;
    }

    @Override
    public ReviewDTO handle(CreateReviewCommand createReviewCommand) {
        Commend review = null;
        try {
            review = commendFactory.saveCommend(UUID.fromString(createReviewCommand.reviewDTO.getUserId()), createReviewCommand.reviewDTO.getCommend(), createReviewCommand.reviewDTO.getValoration(), createReviewCommand.reviewDTO.getProperty(), createReviewCommand.reviewDTO.getPoints());
            if(review == null){
                return null;
            }
            commendRepository.update(review);
            return ReviewMapper.from(review);
        } catch (BusinessRuleValidationException e) {
            throw new RuntimeException(e);
        }

    }
}
