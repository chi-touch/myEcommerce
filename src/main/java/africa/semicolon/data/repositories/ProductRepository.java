package africa.semicolon.data.repositories;

import africa.semicolon.data.model.ProductType;
import africa.semicolon.dto.request.CreateProductRequest;
import africa.semicolon.dto.response.DeleteResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductType, String> {

}
