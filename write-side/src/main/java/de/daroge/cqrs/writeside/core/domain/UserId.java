package de.daroge.cqrs.writeside.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;
import stereotype.AggregateId;


@Value
@AggregateId
public class UserId {
    private String userId;
}
