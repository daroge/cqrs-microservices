package de.daroge.cqrs.writeside.core.domain;

import de.daroge.cqrs.writeside.core.domain.event.DomainEventPublisher;
import de.daroge.cqrs.writeside.core.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import stereotype.AggregateFactory;
import stereotype.AggregateRoot;

import java.util.concurrent.CompletionStage;

@Value
@AggregateRoot
public class User {

    private UserId userId;
    private UserName userName;

    private User(UserId userId, UserName userName){
        this.userId = userId;
        this.userName = userName;
    }

    @AggregateFactory
    @RequiredArgsConstructor
    public static class UserFactory{

        private final DomainEventPublisher domainEventPublisher;
        private final UserRepository userRepository;

        public CompletionStage<User> newUser(UserId userId, UserName userName){
            return null;
        }
    }
}
