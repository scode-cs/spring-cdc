package com.scode.controller;

import com.scode.model.respnse.UserResponse;
import com.scode.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springdoc.api.OpenApiResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserResponse> getUsers() {
        return userService.users();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/users/{id}")
    public UserResponse getUser(@PathVariable Integer id) {
        return userService.user(id).orElseThrow(() -> new OpenApiResourceNotFoundException("User Not Found"));
    }

}
