package com.nur.messenger.factories;

import com.nur.core.BusinessRuleValidationException;
import com.nur.rewiev.Commend;

import java.util.UUID;

public class CommentFactory implements ICommendFactory{
    @Override
    public Commend saveCommend(UUID userId, String comment, String valoration, String ownProperty, int points) throws BusinessRuleValidationException {
        return new Commend(userId, valoration, comment, ownProperty, points);
    }
}
