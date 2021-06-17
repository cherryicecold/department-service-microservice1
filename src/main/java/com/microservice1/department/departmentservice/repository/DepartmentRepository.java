package com.microservice1.department.departmentservice.repository;

import com.microservice1.department.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
//    Department findById(Long departmentId);
}
