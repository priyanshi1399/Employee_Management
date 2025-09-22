package com.priyanshi.EmployeeManagementCRUD.controller;


import com.priyanshi.EmployeeManagementCRUD.DTO.EmployeeRequestDTO;
import com.priyanshi.EmployeeManagementCRUD.DTO.EmployeeResponseDTO;
import com.priyanshi.EmployeeManagementCRUD.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }


    @PostMapping
    public EmployeeResponseDTO create(@RequestBody EmployeeRequestDTO dto){
        return employeeService.createEmployee(dto);
    }

    @GetMapping
    public List<EmployeeResponseDTO> getAllEmployee(){
        return employeeService.getAllEmployees();
    }

    @GetMapping(path="/{id}")
    public EmployeeResponseDTO getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployee(id);
    }

    @GetMapping(path="/emp")
    public List<EmployeeResponseDTO> getEmployeeByDepartmentName(@RequestParam String name){
        return employeeService.getEmployeeByDepartmentName(name);
    }

    @PutMapping(path="/{id}")
    public EmployeeResponseDTO updateEmployee(@PathVariable Long id,@RequestBody EmployeeRequestDTO dto){
        return employeeService.updateEmployee(id,dto);
    }



        @DeleteMapping(path="/{id}")
    public void delete(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        }
}
