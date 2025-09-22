package com.priyanshi.EmployeeManagementCRUD.DTO;

import lombok.Data;


public class EmployeeRequestDTO {
    private String name;
    private  String email;
    private Long departmentId;
    private String city;
    private String street;

    public EmployeeRequestDTO() {
    }

    public EmployeeRequestDTO(String name, String email, Long departmentId, String city, String street) {
        this.name = name;
        this.email = email;
        this.departmentId = departmentId;
        this.city = city;
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
