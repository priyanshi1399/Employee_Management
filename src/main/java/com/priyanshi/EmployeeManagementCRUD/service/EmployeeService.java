package com.priyanshi.EmployeeManagementCRUD.service;

import com.priyanshi.EmployeeManagementCRUD.DTO.EmployeeRequestDTO;
import com.priyanshi.EmployeeManagementCRUD.DTO.EmployeeResponseDTO;
import com.priyanshi.EmployeeManagementCRUD.entity.Address;
import com.priyanshi.EmployeeManagementCRUD.entity.Department;
import com.priyanshi.EmployeeManagementCRUD.entity.Employee;
import com.priyanshi.EmployeeManagementCRUD.repository.DepartmentRepository;
import com.priyanshi.EmployeeManagementCRUD.repository.EmployeeRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
public class EmployeeService  {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;


        public EmployeeService(EmployeeRepository employeeRepository,DepartmentRepository departmentRepository){
            this.employeeRepository = employeeRepository;
            this.departmentRepository = departmentRepository;
        }

        public EmployeeResponseDTO createEmployee(EmployeeRequestDTO dto){
            Department dept=departmentRepository.findById(dto.getDepartmentId())
                    .orElseThrow(()->new RuntimeException("Department Not found"));

            Address address=new Address();
            address.setCity(dto.getCity());
            address.setStreet(dto.getStreet());

            Employee emp=new Employee();
            emp.setName(dto.getName());
            emp.setEmail(dto.getEmail());
            emp.setDepartment(dept);
            emp.setAddress(address);

            Employee saved=employeeRepository.save(emp);

            return mapToResponse(saved);

        }

        public List<EmployeeResponseDTO> getAllEmployees(){
            return employeeRepository.findAll().stream()
                    .map(this::mapToResponse).collect(Collectors.toList());
        }


        public EmployeeResponseDTO getEmployee(Long id){
            return employeeRepository.findById(id)
                    .map(this::mapToResponse).orElseThrow(()->new RuntimeException("Employee not found"));
        }

    public List<EmployeeResponseDTO> getEmployeeByDepartmentName(String departmentName){
        return employeeRepository.findByDepartment_Name(departmentName)
                .stream().map(this::mapToResponse).collect(Collectors.toList());
    }

        public EmployeeResponseDTO updateEmployee(Long id,EmployeeRequestDTO dto){
            Employee existing=employeeRepository.findById(id)
                    .orElseThrow(()->new RuntimeException("employee not found"));

            existing.setName(dto.getName());
            existing.setEmail(dto.getEmail());

            if(dto.getDepartmentId()!=null){
                Department dept=departmentRepository.findById(dto.getDepartmentId())
                        .orElseThrow(()->new RuntimeException("Department not found"));

                existing.setDepartment(dept);
            }

            Address address=new Address();
            address.setCity(dto.getCity());
            address.setStreet(dto.getStreet());
            existing.setAddress(address);

            Employee saved=employeeRepository.save(existing);
            return mapToResponse(saved);
        }


        public void deleteEmployee(Long id){
            employeeRepository.deleteById(id);
        }


        public EmployeeResponseDTO mapToResponse(Employee emp){
            EmployeeResponseDTO dto=new EmployeeResponseDTO();
            dto.setId(emp.getId());
            dto.setName(emp.getName());
            dto.setEmail(emp.getEmail());
            dto.setDepartmentName(emp.getDepartment().getName());
            dto.setCity(emp.getAddress().getCity());
            dto.setStreet(emp.getAddress().getStreet());
            return dto;

        }






}
