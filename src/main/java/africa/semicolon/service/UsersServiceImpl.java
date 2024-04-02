package africa.semicolon.service;

import africa.semicolon.data.model.User;
import africa.semicolon.data.repositories.UsersRepository;
import africa.semicolon.dto.request.*;
import africa.semicolon.dto.response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service


public class UsersServiceImpl implements UsersService{

    @Autowired
    private UsersRepository usersRepository;
    @Override
    public RegisterResponse register(RegisterAdminRequest registerRequest) {

        User myUsers = new User();
        myUsers.setFirstName(registerRequest.getFirstName());
        myUsers.setLastName(registerRequest.getLastName());
        myUsers.setPassword(registerRequest.getPassword());
        myUsers.setHomeAddress(registerRequest.getAddress());
        myUsers.setEmailAddress(registerRequest.getEmail());
        myUsers.setPhoneNumber(registerRequest.getPhoneNumber());
        myUsers.setUsername(registerRequest.getUsername());
        myUsers.setLocked(false);

        usersRepository.save(myUsers);

        RegisterResponse adminResponse = new RegisterResponse();
        adminResponse.setMessage("Registration was successfully");
        return adminResponse;

    }

    @Override
    public RegisterCustomerResponse registerCustomer(RegisterCustomerRequest registerCustomerRequest) {

        User myUser = new User();
        myUser.setUsername(registerCustomerRequest.getUsername());
        myUser.setPassword(registerCustomerRequest.getPassword());
        myUser.setFirstName(registerCustomerRequest.getFirstName());
        myUser.setLastName(registerCustomerRequest.getLastName());
        myUser.setPhoneNumber(registerCustomerRequest.getPhoneNumber());
        myUser.setEmailAddress(registerCustomerRequest.getEmailAddress());
        myUser.setEmailAddress(registerCustomerRequest.getEmailAddress());
        myUser.setLocked(false);

        usersRepository.save(myUser);

        RegisterCustomerResponse customerResponse = new RegisterCustomerResponse();
        customerResponse.setMessage("Registration is successfully");

        return customerResponse;
    }

    @Override
    public RegisterSellerResponse registerSeller(RegisterSellerRequest registerSellerRequest) {

        User myUser = new User();
        myUser.setUsername(registerSellerRequest.getUsername());
        myUser.setPassword(registerSellerRequest.getPassword());
        myUser.setFirstName(registerSellerRequest.getFirstName());
        myUser.setLastName(registerSellerRequest.getLastName());
        myUser.setPhoneNumber(registerSellerRequest.getPhoneNumber());
        myUser.setEmailAddress(registerSellerRequest.getEmailAddress());

        usersRepository.save(myUser);

        RegisterSellerResponse sellerResponse = new RegisterSellerResponse();
        sellerResponse.setMessage("Registration is successfully");
        return sellerResponse;
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        String userName = loginRequest.getUsername();
        String password = loginRequest.getPassword();
        User user = usersRepository.findByUsername(userName);
        if (user!= null && user.getPassword().equals(password)) {}



        return null;
    }

    @Override
    public long count() {
        return usersRepository.count();
    }

    @Override
    public void deleteAll() {
        usersRepository.deleteAll();
    }

    @Override
    public LogOutResponse logout(LogOutRequest logoutRequest) {
        return usersRepository.logout(logoutRequest);
    }
}
