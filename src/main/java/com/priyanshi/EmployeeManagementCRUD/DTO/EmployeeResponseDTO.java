package com.priyanshi.EmployeeManagementCRUD.DTO;

import lombok.Data;

@Data
public class EmployeeResponseDTO {
    private Long id;
    private String name;
    private  String email;
    private String departmentName;
    private String city;
    private String street;
}
