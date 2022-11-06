package com.example.payroll.service;

import com.example.payroll.entity.Employee;
import com.example.payroll.exception.EmployeeNotFoundException;
import com.example.payroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private  EmployeeRepository repository;

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository){
        this.repository=employeeRepository;
    }

    @Override
    public List<Employee> getEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));

    }

    @Override
    public Employee addEmployee(Employee employee) {
         return repository.save(employee);
    }

    @Override
    public void deleteEmployee(long id) {
        repository.deleteById(id);
    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {
       return  repository.findById(id)
                .map(newEmployee -> {
                    newEmployee.setName(employee.getName());
                    newEmployee.setRole(employee.getRole());
                    return repository.save(newEmployee);
                })
                .orElseGet(() -> {
                    employee.setId(id);
                    return repository.save(employee);
                });
    }
}
