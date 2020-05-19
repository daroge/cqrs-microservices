package de.daroge.cqrs.writeside.core.application;

import de.daroge.cqrs.writeside.core.domain.User;

import java.util.concurrent.CompletionStage;

public interface UpdateUserUseCase {

    CompletionStage<User> updateUser(UserCommand userCommand);
}
