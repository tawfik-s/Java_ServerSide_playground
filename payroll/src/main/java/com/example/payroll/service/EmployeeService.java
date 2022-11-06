package com.example.payroll.service;

import com.example.payroll.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface EmployeeService {

    public List<Employee> getEmployees();
    public Employee getEmployeeById(long id);
    public Employee addEmployee(Employee employee);
    public void deleteEmployee(long id);

    public Employee updateEmployee(Employee employee,long id);
}
