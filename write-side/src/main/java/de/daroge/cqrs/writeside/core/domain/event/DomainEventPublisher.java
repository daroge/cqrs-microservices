package de.daroge.cqrs.writeside.core.domain.event;

import de.daroge.cqrs.domain.events.DomainEvent;


public interface DomainEventPublisher {
    void publish(DomainEvent domainEvent);
}
