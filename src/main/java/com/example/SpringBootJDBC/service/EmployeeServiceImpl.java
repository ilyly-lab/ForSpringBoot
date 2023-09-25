package com.example.SpringBootJDBC.service;


import com.example.SpringBootJDBC.entity.Employee;
import com.example.SpringBootJDBC.repozitory.EmployeeRepozitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepozitory employeeRepozitory;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepozitory employeeRepozitory) {
        this.employeeRepozitory = employeeRepozitory;
    }

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeRepozitory.findAll();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeRepozitory.save(employee);
    }

    @Override
    @Transactional
    public Employee getEmployee(long id) {
        return employeeRepozitory.getOne(id);
    }

    @Override
    @Transactional
    public void deleteEmployee(long id) {
         employeeRepozitory.deleteById(id);
    }
}
