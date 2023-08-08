package com.nur.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

public abstract class Entity {
    public UUID id;
    private Collection<DomainEvent> _domainEvents;
    public Collection<DomainEvent> domainEvents;

    public Entity() {
        this._domainEvents = new ArrayList<DomainEvent>();
    }

    public UUID getId() {
        return id;
    }

    protected void setId(UUID id) {
        this.id = id;
    }

    public Collection<DomainEvent> getDomainEvents() {
        return domainEvents;
    }

    public void addDomainEvent(DomainEvent event){
        _domainEvents.add(event);
    }

    public void clearDomainEvents(){
        _domainEvents.clear();
    }

    protected void checkRule(IBusinessRule rule) throws Exception {
        if(rule == null){
            throw new Exception("Rule cannot be null");
        }
        if(!rule.isValid()){
            throw new BusinessRuleValidationException(rule);
        }
    }

    public boolean equals(Object obj){
        return obj != null && id == ((Entity) obj).id;
    }
}
