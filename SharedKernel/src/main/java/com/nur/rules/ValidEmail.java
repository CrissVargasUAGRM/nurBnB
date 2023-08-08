package com.nur.rules;

import com.nur.core.IBusinessRule;

public class ValidEmail implements IBusinessRule {
    public String _email;

    public ValidEmail(String _email) {
        this._email = _email;
    }

    @Override
    public boolean isValid() {
        return _email.matches("/^\\w+([.-_+]?\\w+)*@\\w+([.-]?\\w+)*(\\.\\w{2,10})+$/");
    }

    @Override
    public String getMessage() {
        return "Invalid email person";
    }
}
