package com.priyanshi.EmployeeManagementCRUD.repository;

import com.priyanshi.EmployeeManagementCRUD.entity.EmployeeDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDetailRepository extends JpaRepository<EmployeeDetail,Long> {
}
