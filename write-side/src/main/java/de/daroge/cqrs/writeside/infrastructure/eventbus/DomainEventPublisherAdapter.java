package de.daroge.cqrs.writeside.infrastructure.eventbus;

import de.daroge.cqrs.writeside.core.domain.event.DomainEventPublisher;
import de.daroge.cqrs.domain.events.DomainEvent;
import stereotype.EventBusAdapter;

@EventBusAdapter
public class DomainEventPublisherAdapter implements DomainEventPublisher {

    public void publish(DomainEvent domainEvent) {
    }
}
