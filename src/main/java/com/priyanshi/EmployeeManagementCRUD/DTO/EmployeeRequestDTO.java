package com.priyanshi.EmployeeManagementCRUD.DTO;

import lombok.Data;

@Data
public class EmployeeRequestDTO {
    private String name;
    private  String email;
    private Long departmentId;
    private String city;
    private String street;

}
