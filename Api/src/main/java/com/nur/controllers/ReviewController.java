package com.nur.controllers;

import an.awesome.pipelinr.Pipeline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/review")
public class ReviewController {
    final Pipeline pipeline;

    @Autowired
    public ReviewController(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    @PostMapping("/create")
    public UUID crateReview(){
        return UUID.randomUUID();
    }
}
