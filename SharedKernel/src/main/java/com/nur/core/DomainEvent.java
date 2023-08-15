package com.nur.core;

import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
public abstract class DomainEvent {
    public LocalDate occurredOn;
    public UUID id;

    public boolean consumed;

    public boolean isConsumed() {
        return consumed;
    }

    public void setConsumed(boolean consumed) {
        this.consumed = consumed;
    }

    protected DomainEvent(LocalDate occurredOn){
        this.id = UUID.randomUUID();
        this.occurredOn = occurredOn;
    }

    public void markAsConsumed(){
        consumed = true;
    }

}
