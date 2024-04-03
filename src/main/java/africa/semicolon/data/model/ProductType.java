package africa.semicolon.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
@Document("Product")


public class ProductType {

    private String productName;
    private BigDecimal productPrice;
    private LocalDate dateCreated;

}
