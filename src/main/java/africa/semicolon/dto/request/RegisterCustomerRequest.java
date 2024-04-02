package africa.semicolon.dto.request;

import africa.semicolon.data.model.Address;
import lombok.Data;

@Data

public class RegisterCustomerRequest {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private String username;
    private String phoneNumber;
    private Address address;


}
