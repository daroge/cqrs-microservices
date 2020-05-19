package de.daroge.cqrs.writeside.core.application;

import de.daroge.cqrs.writeside.core.domain.UserId;
import de.daroge.cqrs.writeside.core.domain.UserName;
import lombok.Value;

import javax.validation.constraints.NotNull;

@Value
public class UserCommand extends Validatable<UserCommand> {

    @NotNull
    private UserId userId;
    @NotNull
    private UserName userName;

    UserCommand(UserId userId,UserName userName){
        super();
        this.userId = userId;
        this.userName = userName;
    }
}
