package com.priyanshi.EmployeeManagementCRUD.repository;

import com.priyanshi.EmployeeManagementCRUD.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
