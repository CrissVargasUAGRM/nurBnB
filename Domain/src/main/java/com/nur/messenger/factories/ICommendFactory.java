package com.nur.messenger.factories;


import com.nur.core.BusinessRuleValidationException;
import com.nur.rewiev.Commend;

import java.util.UUID;

public interface ICommendFactory {
    Commend saveCommend(UUID userId, String comment, String valoration, String ownProperty, int points) throws BusinessRuleValidationException;
}
