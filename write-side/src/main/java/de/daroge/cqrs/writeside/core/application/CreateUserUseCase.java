package de.daroge.cqrs.writeside.core.application;

import de.daroge.cqrs.writeside.core.domain.UserId;

import java.util.concurrent.CompletionStage;

public interface CreateUserUseCase {

    CompletionStage<UserId> createUser(UserCommand createUserCommand);

}
