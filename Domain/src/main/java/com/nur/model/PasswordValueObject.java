package com.nur.model;

import com.nur.core.BusinessRuleValidationException;
import com.nur.core.ValueObject;
import com.nur.rules.StringNotNullOrEmptyRule;

public class PasswordValueObject extends ValueObject {
    public String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PasswordValueObject(String value) throws BusinessRuleValidationException {
        checkRule(new StringNotNullOrEmptyRule(value));
        this.value = value;
    }

    public static String implicitOperator(PasswordValueObject pass) {
        return pass.getValue();
    }

    public static PasswordValueObject implicitOperator(String itemName) throws BusinessRuleValidationException {
        return new PasswordValueObject(itemName);
    }
}
