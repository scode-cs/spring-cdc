package com.scode.contractTest;

import com.scode.SpringCdcApplication;
import com.scode.controller.DepartmentController;
import com.scode.controller.UserController;
import com.scode.model.respnse.DepartmentResponse;
import com.scode.model.respnse.UserResponse;
import com.scode.service.DepartmentService;
import com.scode.service.UserService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = SpringCdcApplication.class)
public abstract class BaseTestClass {

    @Autowired
    private UserController userController;

    @MockBean
    private UserService userService;


    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(userController);

        when(userService.users()).thenReturn(List.of(new UserResponse(1, "User One"),
                new UserResponse(2, "User Two")));
        when(userService.user(1)).thenReturn(Optional.of(new UserResponse(1, "User One")));
        when(userService.user(10)).thenReturn(Optional.empty());
    }


}
