package com.nur.repositories.reviews;

import com.nur.core.BusinessRuleValidationException;
import com.nur.messenger.factories.ICommendFactory;
import com.nur.rewiev.Commend;

import java.util.UUID;

public class ReviewCrudRepositoryImpl implements ICommendFactory {
    @Override
    public Commend saveCommend(UUID userId, String comment, String valoration, String ownProperty, int points) throws BusinessRuleValidationException {
        return null;
    }
}
