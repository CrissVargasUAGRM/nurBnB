package com.nur.command.review.get;

import an.awesome.pipelinr.Command;
import com.nur.dto.ReviewDTO;
import lombok.Getter;

@Getter
public class GetReviewCommand implements Command<ReviewDTO> {
    String reviewId;

    public GetReviewCommand(String reviewId) {
        this.reviewId = reviewId;
    }
}
