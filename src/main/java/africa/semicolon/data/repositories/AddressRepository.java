package africa.semicolon.data.repositories;

import africa.semicolon.data.model.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<Address, String> {
}
