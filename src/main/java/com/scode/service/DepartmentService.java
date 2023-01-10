package com.scode.service;

import com.scode.model.respnse.DepartmentResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    private List<DepartmentResponse> departments;

    public DepartmentService() {
        departments = List.of(new DepartmentResponse("dep1", "Department One"),
                new DepartmentResponse("dep2", "Department Two"),
                new DepartmentResponse("dep3", "Department Three"),
                new DepartmentResponse("dep4", "Department Four"));
    }

    public List<DepartmentResponse> departments() {
        return departments;
    }

    public Optional<DepartmentResponse> department(String shortId) {
        return departments.stream().filter(dept -> shortId.equals(dept.shortId())).findFirst();
    }
}
