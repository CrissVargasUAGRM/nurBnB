package com.nur.repositories.reviews;

import com.nur.model.ReviewJpaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IReviewCrudRepository extends JpaRepository<ReviewJpaModel, UUID> {
}
