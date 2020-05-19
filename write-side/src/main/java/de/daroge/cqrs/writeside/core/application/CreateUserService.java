package de.daroge.cqrs.writeside.core.application;

import de.daroge.cqrs.writeside.core.domain.UserId;
import de.daroge.cqrs.writeside.core.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import stereotype.ApplicationService;

import java.util.concurrent.CompletionStage;

@ApplicationService
@RequiredArgsConstructor
public class CreateUserService implements CreateUserUseCase {

    private final UserRepository userRepository;

    @Override
    public CompletionStage<UserId> createUser(UserCommand createUserCommand) {
        return null;
    }
}
