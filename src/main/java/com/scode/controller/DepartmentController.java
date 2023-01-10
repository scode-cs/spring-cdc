package com.scode.controller;

import com.scode.model.respnse.DepartmentResponse;
import com.scode.model.respnse.UserResponse;
import com.scode.service.DepartmentService;
import com.scode.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/v1", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<DepartmentResponse> getDepartments() {
        return departmentService.departments();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/v1/{id}")
    public DepartmentResponse getUser(@PathVariable String id) {
        return departmentService.department(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User Not Found"));
    }
}
