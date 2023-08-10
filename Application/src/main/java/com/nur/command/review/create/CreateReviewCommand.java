package com.nur.command.review.create;

import an.awesome.pipelinr.Command;
import com.nur.dto.ReviewDTO;

public class CreateReviewCommand implements Command<ReviewDTO> {
    ReviewDTO reviewDTO;

    public CreateReviewCommand(ReviewDTO reviewDTO) {
        this.reviewDTO = reviewDTO;
    }
}
