package com.nur.command.review.get;

import an.awesome.pipelinr.Command;
import com.nur.dto.ReviewDTO;
import com.nur.factories.commends.ICommendFactory;
import com.nur.repositories.ICommendRepository;
import com.nur.model.Commend;
import com.nur.util.ReviewMapper;

import java.util.UUID;

public class GetReviewHandler implements Command.Handler<GetReviewCommand, ReviewDTO> {

    private final ICommendRepository commendRepository;

    private final ICommendFactory commendFactory;

    public GetReviewHandler(ICommendRepository commendRepository, ICommendFactory commendFactory) {
        this.commendRepository = commendRepository;
        this.commendFactory = commendFactory;
    }

    @Override
    public ReviewDTO handle(GetReviewCommand getReviewCommand) {
        Commend review = commendRepository.getById(UUID.fromString(getReviewCommand.getReviewId()));
        if(review == null){
            return null;
        }
        return ReviewMapper.from(review);
    }
}
