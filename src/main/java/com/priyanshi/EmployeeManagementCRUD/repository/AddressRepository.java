package com.priyanshi.EmployeeManagementCRUD.repository;

import com.priyanshi.EmployeeManagementCRUD.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
