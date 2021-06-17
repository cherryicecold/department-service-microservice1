package com.microservice1.department.departmentservice.controller;

import com.microservice1.department.departmentservice.entity.Department;
import com.microservice1.department.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of DepartmentController");
        System.out.println(department);
        return departmentService.saveDepartment(department);
    }

    @GetMapping("{id}")
    public Optional<Department> findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Inside the findDepartmentById method of DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }
}
