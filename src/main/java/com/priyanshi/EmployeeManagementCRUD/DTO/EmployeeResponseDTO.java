package com.priyanshi.EmployeeManagementCRUD.DTO;


public class EmployeeResponseDTO {
    private Long id;
    private String name;
    private  String email;
    private String departmentName;
    private String city;
    private String street;

    public EmployeeResponseDTO() {
    }

    public EmployeeResponseDTO(Long id, String name, String email, String departmentName, String city, String street) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.departmentName = departmentName;
        this.city = city;
        this.street = street;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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
