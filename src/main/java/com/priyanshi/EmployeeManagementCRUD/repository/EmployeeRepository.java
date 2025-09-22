package com.priyanshi.EmployeeManagementCRUD.repository;

import com.priyanshi.EmployeeManagementCRUD.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
