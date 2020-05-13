package de.daroge.cqrs.writeside.domain;

import stereotype.AggregateRoot;

@AggregateRoot
public class User {

    private UserId userId;
    private String userName;
}
