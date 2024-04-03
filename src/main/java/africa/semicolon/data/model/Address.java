package africa.semicolon.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data


public class Address {


    private String cityName;
    private String countryName;
    private String streetName;
    private String stateName;
    private String emailAddress;

}
