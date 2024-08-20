package com.pasechnik.spring.mvc;

import jakarta.validation.constraints.*;

import java.util.HashMap;
import java.util.Map;

public class Employee {


    @Size(min = 2, message = "name must be at least 2 symbols")
    private String name;
    @NotBlank(message = "must be written")
    private String surname;
    @Min(value = 500, message = "must be greater than 500")
    @Max(value = 1000, message = "must be less than 1000")
    private int salary;
    private String department;
    private Map<String, String> departments;

    public Map<String, String> getDepartments() {
        return departments;
    }

    private String carBrand;
    private Map<String, String> carBrands;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail
    private String email;


    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "I Tech");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMV", "BMV");
        carBrands.put("Mercedes-Benz", "MB");
        carBrands.put("Audi", "Audi");


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

}
