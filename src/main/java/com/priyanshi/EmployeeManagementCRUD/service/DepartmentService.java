package com.priyanshi.EmployeeManagementCRUD.service;

import com.priyanshi.EmployeeManagementCRUD.DTO.DepartmentDTO;
import com.priyanshi.EmployeeManagementCRUD.entity.Department;
import com.priyanshi.EmployeeManagementCRUD.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department createDepartment(DepartmentDTO dto){
        Department dept=new Department();
        dept.setName(dto.getName());
        return departmentRepository.save(dept);
    }

    public List<Department> getAllDepartment(){
        return departmentRepository.findAll();
    }


}
