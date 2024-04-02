package africa.semicolon.dto.request;

import lombok.Data;

@Data
public class RegisterSellerRequest {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private String username;
    private String phoneNumber;

}
