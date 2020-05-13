package de.daroge.cqrs.writeside.user.domain.events;

import de.daroge.cqrs.writeside.domain.events.DomainEvent;

public class UserCreatedEvent extends DomainEvent {

    UserCreatedEvent(String userId){
        super(userId);
    }
}
