package africa.semicolon.dto.request;

import lombok.Data;

@Data

public class DeleteProductRequest {
    private String productName;
    private String productQuantity;

}
