package de.daroge.cqrs.writeside.infrastructure.persistence;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserPersistenceModel {

    private final Long databaseId;
    private final String domainId;
    private final String payload;
}
