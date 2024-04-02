package africa.semicolon.service;

import africa.semicolon.dto.request.CreateProductRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class ProductTypeServiceImplTest {

    CreateProductRequest createProductRequest;
    @Autowired
    ProductTypeService productTypeService;

    @BeforeEach
    public void setUp() {
        productTypeService.deleteAll();

        createProductRequest = new CreateProductRequest();


    }
    @Test
    public void testToCreateProduct(){
        createProductRequest.setProductName("fish");
        createProductRequest.setProductType("can");
        createProductRequest.setPrice(BigDecimal.valueOf(100.00));
        createProductRequest.setQuantity(5);

        productTypeService.create(createProductRequest);
        assertThat(productTypeService.count(), is(1L));
    }

    @Test
    public void testToCreatMoreProduct(){
        createProductRequest.setProductName("meat");
        createProductRequest.setProductType("frozen");
        createProductRequest.setPrice(BigDecimal.valueOf(300.00));
        createProductRequest.setQuantity(50);

        productTypeService.create(createProductRequest);

        CreateProductRequest createProductRequest1 = new CreateProductRequest();

        createProductRequest1.setProductName("drink");
        createProductRequest1.setProductType("can");
        createProductRequest1.setPrice(BigDecimal.valueOf(200.00));
        createProductRequest1.setQuantity(51);

        productTypeService.create(createProductRequest1);
        assertThat(productTypeService.count(),is(2L));
    }

    @Test
    public void testToDeleteProduct(){
        createProductRequest.setProductName("meat");
        createProductRequest.setProductType("frozen");
        createProductRequest.setPrice(BigDecimal.valueOf(300.00));
        createProductRequest.setQuantity(50);

        productTypeService.create(createProductRequest);

        CreateProductRequest createProductRequest1 = new CreateProductRequest();

        createProductRequest1.setProductName("drink");
        createProductRequest1.setProductType("can");
        createProductRequest1.setPrice(BigDecimal.valueOf(200.00));
        createProductRequest1.setQuantity(51);

        productTypeService.create(createProductRequest1);
        //productTypeService.delete(createProductRequest1);
        assertEquals(2, productTypeService.count());

    }



}