package africa.semicolon.service;

import africa.semicolon.dto.request.*;
import africa.semicolon.dto.response.*;

public interface UsersService {
    RegisterResponse register(RegisterAdminRequest registerRequest );
    RegisterCustomerResponse registerCustomer(RegisterCustomerRequest registerCustomerRequest);

    RegisterSellerResponse registerSeller(RegisterSellerRequest registerSellerRequest);
    LoginResponse login(LoginRequest loginRequest);

    long count();

    void deleteAll();

    LogOutResponse logout(LogOutRequest logoutRequest);


}
