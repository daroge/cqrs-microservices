package de.daroge.cqrs.domain.events;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class DomainEvent {
    private final String id;
    private final LocalDateTime publishedAt;
    private final String payload;
    private final String type;

    DomainEvent(String id, String type, String payload){
        this.id = id;
        this.type = type;
        publishedAt = LocalDateTime.now();
        this.payload = payload;
    }
}
