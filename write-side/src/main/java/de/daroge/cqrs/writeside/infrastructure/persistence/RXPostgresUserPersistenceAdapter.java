package de.daroge.cqrs.writeside.infrastructure.persistence;

import de.daroge.cqrs.writeside.core.domain.repository.UserRepository;
import stereotype.PersistenceAdapter;

@PersistenceAdapter
public class RXPostgresUserPersistenceAdapter implements UserRepository {

}
