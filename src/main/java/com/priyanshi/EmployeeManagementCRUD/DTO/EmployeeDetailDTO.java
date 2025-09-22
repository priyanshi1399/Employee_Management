package com.priyanshi.EmployeeManagementCRUD.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDetailDTO {
    private Long id;

    private String address;
    private String phone;
}

