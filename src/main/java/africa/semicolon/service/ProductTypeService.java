package africa.semicolon.service;

import africa.semicolon.data.model.ProductType;
import africa.semicolon.dto.request.CreateProductRequest;
import africa.semicolon.dto.response.CreateProductResponse;
import africa.semicolon.dto.response.DeleteResponse;


public interface ProductTypeService {
    CreateProductResponse create(CreateProductRequest createProductRequest);

    long count();

    void deleteAll();

    void delete(ProductType productType);
}



