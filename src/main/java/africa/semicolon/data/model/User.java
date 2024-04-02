package africa.semicolon.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Data
@Document("Users")
public class User {

    private String firstName;
    private String lastName;
    private UserType userType;
    private String username;
    private String emailAddress;
    private String password;
    private Address homeAddress;
    private String phoneNumber;
    private LocalDate dateCreated;
    private boolean isLocked = false;


}
