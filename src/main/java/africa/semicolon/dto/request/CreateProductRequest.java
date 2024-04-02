package africa.semicolon.dto.request;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class CreateProductRequest {

    private String  productName;
    private String productType;
    private int quantity;
    private BigDecimal price;


}
