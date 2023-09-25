package com.example.SpringBootJDBC.repozitory;

import com.example.SpringBootJDBC.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepozitory extends JpaRepository<Employee, Long> {
}
