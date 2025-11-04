package in.vardhan.billingsoftware.service;

import in.vardhan.billingsoftware.io.UserRequest;
import in.vardhan.billingsoftware.io.UserResponse;
import java.util.List;

public interface UserService {
    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);
}
