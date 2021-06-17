package com.microservice1.department.departmentservice.service;

import com.microservice1.department.departmentservice.entity.Department;
import com.microservice1.department.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of DepartmentService ");
        return departmentRepository.save(department);
    }

    public Optional<Department> findDepartmentById(Long departmentId) {
        log.info("Inside departmentRepository method of DepartmentService");
        return departmentRepository.findById(departmentId);
    }
}
