package de.daroge.cqrs.writeside.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import stereotype.AggregateId;

@Getter
@AggregateId
@AllArgsConstructor
public class UserId {
    private String userId;
}
