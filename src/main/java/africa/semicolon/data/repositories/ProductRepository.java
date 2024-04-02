package africa.semicolon.data.repositories;

import africa.semicolon.data.model.ProductType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductType, String> {
}
