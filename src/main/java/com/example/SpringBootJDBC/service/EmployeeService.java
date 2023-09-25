package com.example.SpringBootJDBC.service;



import com.example.SpringBootJDBC.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);

    Employee getEmployee(long id);

    public void deleteEmployee(long id);
}
