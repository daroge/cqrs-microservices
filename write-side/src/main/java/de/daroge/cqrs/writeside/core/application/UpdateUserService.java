package de.daroge.cqrs.writeside.core.application;

import de.daroge.cqrs.writeside.core.domain.User;
import de.daroge.cqrs.writeside.core.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import stereotype.ApplicationService;

import java.util.concurrent.CompletionStage;

@ApplicationService
@RequiredArgsConstructor
public class UpdateUserService implements UpdateUserUseCase {

    private final UserRepository userRepository;

    @Override
    public CompletionStage<User> updateUser(UserCommand userCommand) {
        return null;
    }
}
