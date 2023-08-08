package com.nur.valueObjects;

import com.nur.core.BusinessRuleValidationException;
import com.nur.core.ValueObject;
import com.nur.rules.StringNotNullOrEmptyRule;

public class PersonNameValue extends ValueObject {
    public String Name;

    public PersonNameValue(String name) throws BusinessRuleValidationException {
        checkRule(new StringNotNullOrEmptyRule(name));
        if(name.length() > 50){
            throw new BusinessRuleValidationException("PersonName can't be more than 500 characters");
        }
        Name = name;
    }

    @Override
    public String toString() {
        return Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
}
