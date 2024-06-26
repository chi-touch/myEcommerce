package africa.semicolon.data.repositories;

import africa.semicolon.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String userName);
}
