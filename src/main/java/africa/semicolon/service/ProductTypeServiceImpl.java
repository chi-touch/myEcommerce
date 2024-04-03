package africa.semicolon.service;

import africa.semicolon.data.model.ProductType;
import africa.semicolon.data.repositories.ProductRepository;
import africa.semicolon.dto.request.CreateProductRequest;
import africa.semicolon.dto.response.CreateProductResponse;
import africa.semicolon.dto.response.DeleteResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ProductTypeServiceImpl implements ProductTypeService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public CreateProductResponse create(CreateProductRequest createProductRequest) {
        ProductType productType = new ProductType();
        productType.setProductName(createProductRequest.getProductName());
        productType.setProductPrice(createProductRequest.getPrice());
        productType.setDateCreated(LocalDate.now());

        productRepository.save(productType);

        CreateProductResponse productResponse = new CreateProductResponse();
        productResponse.setMessage("Product created successfully");

        return productResponse;
    }

    @Override
    public long count() {
        return productRepository.count();
    }

    @Override
    public void deleteAll() {
        productRepository.deleteAll();
    }

    @Override
    public void delete(String productType) {

    }

    @Override
    public void  delete(ProductType productType) {
         productRepository.delete(productType);
    }
}
