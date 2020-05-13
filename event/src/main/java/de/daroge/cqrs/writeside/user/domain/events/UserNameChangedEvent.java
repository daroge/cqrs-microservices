package de.daroge.cqrs.writeside.user.domain.events;

import de.daroge.cqrs.writeside.domain.events.DomainEvent;

public class UserNameChangedEvent extends DomainEvent {

    public UserNameChangedEvent(String userId) {
        super(userId);
    }
}
