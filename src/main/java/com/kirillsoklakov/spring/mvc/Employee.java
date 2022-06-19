package com.kirillsoklakov.spring.mvc;

import com.kirillsoklakov.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "Name must be min 2 symbols")
    private String name;
    @NotBlank(message = "Surname is required field")
    private String surname;
    @Min(message = "Salary must be greater then 499", value = 500)
    @Max(message = "Salary must be less then 1001", value = 1000)
    private int salary;
    private String department;
    private Map <String, String> departments;
    private String carBrand;
    private Map <String, String> carBrands;
    private String[] languages;
    private Map <String, String> languageList;
    @CheckEmail(value = "yandex.ru", message = "e-mail should ends with yandex.ru")
    private String Email;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "Error. Wrong number. Please enter your number in format xxx-xx-xx")
    private String phoneNumber;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information technologies");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Lada", "Lada");
        carBrands.put("Toyota", "Toyota");

        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("French", "FR");
        languageList.put("Russian", "RUS");
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

    public Map<String, String> getDepartments() {
        return departments;
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

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", departments=" + departments +
                ", carBrand='" + carBrand + '\'' +
                ", carBrands=" + carBrands +
                '}';
    }

}
