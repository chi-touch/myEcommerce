package africa.semicolon.service;

import africa.semicolon.data.model.Address;
import africa.semicolon.dto.request.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UsersServiceImplTest {

    RegisterAdminRequest registerAdminRequest;

    RegisterCustomerRequest registerCustomerRequest;
    RegisterAdminRequest registerAdminRequest1;
    RegisterCustomerRequest registerCustomerRequest1;
    RegisterSellerRequest registerSellerRequest;
    LoginRequest loginRequest;
    LogOutRequest logOutRequest;

    @BeforeEach
    public void setUp() {

        registerAdminRequest = new RegisterAdminRequest();
        registerCustomerRequest = new RegisterCustomerRequest();
        registerAdminRequest1 = new RegisterAdminRequest();
        registerCustomerRequest1 = new RegisterCustomerRequest();
        registerSellerRequest = new RegisterSellerRequest();
        loginRequest = new LoginRequest();
        logOutRequest = new LogOutRequest();
    }
    @AfterEach
    void tearDown() {
        usersService.deleteAll();
    }

    @Autowired
    UsersService usersService;

    @Test
    public void testToRegisterAdmin(){
        registerAdminRequest.setFirstName("chichi");
        registerAdminRequest.setLastName("dave");
        registerAdminRequest.setEmail("chichi@gmail.com");
        registerAdminRequest.setPassword("1234");
        registerAdminRequest.setAddress(new Address());
        registerAdminRequest.setPhoneNumber("08103722570");
        registerAdminRequest.setUsername("ami");
        usersService.register(registerAdminRequest);
        assertEquals(1, usersService.count());
    }

    @Test
    public void testToRegisterTwoAdmin(){
        usersService.register(registerAdminRequest);
//        RegisterAdminRequest registerAdminRequest1 = new RegisterAdminRequest();
//        registerAdminRequest1.setUsername("vic");
//        registerAdminRequest1.setPassword("2222");
//        registerAdminRequest1.setPassword("08076834992");
//        registerAdminRequest1.setFirstName("victor");
//        registerAdminRequest1.setLastName("chima");
//        registerAdminRequest1.setEmail("my@gmail.com");
//        registerAdminRequest1.setAddress(new Address());
//        registerAdminRequest1.
        usersService.register(registerAdminRequest1);
        assertEquals(2,usersService.count());
    }

    @Test
    public void testRegisterCustomer(){
        usersService.registerCustomer(registerCustomerRequest);
        assertEquals(1,usersService.count());
    }
    @Test
    public void testToRegisterTwoCustomer(){
        usersService.registerCustomer(registerCustomerRequest);
        usersService.registerCustomer(registerCustomerRequest1);
        assertEquals(2,usersService.count());
    }

    @Test
    public void testToRegisterSeller(){
        usersService.registerSeller(registerSellerRequest);
        assertEquals(1,usersService.count());
    }

    @Test
    public void testToLoginUser(){
        usersService.registerSeller(registerSellerRequest);
        usersService.login(loginRequest);
        assertEquals(1,usersService.count());
    }

    @Test
    public void testToLoginTwoUsers(){
        usersService.registerSeller(registerSellerRequest);
        usersService.registerCustomer(registerCustomerRequest);
        assertEquals(2,usersService.count());
    }

//    @Test
//    public void testToLogOutUser(){
//        usersService.registerSeller(registerSellerRequest);
//        usersService.login(loginRequest);
//        usersService.logout(logOutRequest);
//        assertEquals(0,usersService.count());
//    }


    @Test
    public void testToFindUser(){

    }




}