package com.nur.messenger.personas;

import com.nur.core.BusinessRuleValidationException;
import com.nur.core.Entity;
import lombok.Builder;

import java.util.UUID;

@Builder
public class Personas extends Entity {
    public String name;
    public String lastName;
    public String ci;
    public UUID userId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public Personas(String name, String lastName, String ci, UUID userId) {
        id = UUID.randomUUID();
        this.name = name;
        this.lastName = lastName;
        this.ci = ci;
        this.userId = userId;
    }

    public Personas() {
    }

    public void asociarUsuarioPersona(UUID userId) throws BusinessRuleValidationException {
        if(userId.equals("") || userId == null){
            throw new BusinessRuleValidationException("userId invalid");
        }
        this.userId = userId;
    }
}
