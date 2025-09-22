package com.priyanshi.EmployeeManagementCRUD.service;

import com.priyanshi.EmployeeManagementCRUD.DTO.DepartmentDTO;
import com.priyanshi.EmployeeManagementCRUD.entity.Department;
import com.priyanshi.EmployeeManagementCRUD.entity.Employee;
import com.priyanshi.EmployeeManagementCRUD.repository.DepartmentRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class  DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department createDepartment(DepartmentDTO dto){
        if(departmentRepository.existsByName(dto.getName())){
            throw new RuntimeException("Department exists by the name "+dto.getName());
        }
        Department dept=new Department();
        dept.setName(dto.getName());
        return departmentRepository.save(dept);
    }

    public List<Department> getAllDepartment(){
        return departmentRepository.findAll();
    }



}
