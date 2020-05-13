package de.daroge.cqrs.writeside.domain.events;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class DomainEvent {
    private String userId;
}
