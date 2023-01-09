package com.scode.service;

import com.scode.model.respnse.UserResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<UserResponse> users;

    public UserService() {
        users = List.of(new UserResponse(1, "User One"),
                new UserResponse(2, "User Two"),
                new UserResponse(3, "User Three"),
                new UserResponse(4, "User Four"));
    }

    public List<UserResponse> users() {
        return users;
    }

    public Optional<UserResponse> user(Integer id) {
        return users.stream().filter(usr -> id.equals(usr.id())).findFirst();
    }
}
