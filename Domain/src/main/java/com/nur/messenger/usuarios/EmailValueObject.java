package com.nur.messenger.usuarios;

import com.nur.core.BusinessRuleValidationException;
import com.nur.core.ValueObject;
import com.nur.rules.ValidEmail;

public class EmailValueObject extends ValueObject {
    public String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public EmailValueObject(String value) throws BusinessRuleValidationException {
        checkRule(new ValidEmail(value));
        this.value = value;
    }

    public static String implicitOperator(EmailValueObject email) {
        return email.getValue();
    }

    public static PasswordValueObject implicitOperator(String email) throws BusinessRuleValidationException {
        return new PasswordValueObject(email);
    }
}
