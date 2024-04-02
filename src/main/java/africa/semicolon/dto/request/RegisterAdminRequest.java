package africa.semicolon.dto.request;

import africa.semicolon.data.model.Address;
import lombok.Data;

@Data

public class RegisterAdminRequest {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Address address;
}
