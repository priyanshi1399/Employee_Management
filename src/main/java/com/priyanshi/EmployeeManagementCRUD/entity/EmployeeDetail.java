package com.priyanshi.EmployeeManagementCRUD.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDetail {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String address;
    private String phone;

    @OneToOne(mappedBy="employeeDetail",cascade= CascadeType.ALL)
    private Employee employee;
}
