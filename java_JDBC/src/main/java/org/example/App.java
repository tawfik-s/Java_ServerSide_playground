package org.example;

import org.example.dao.EmployeeDaoImplementation;
import org.example.models.Employee;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws SQLException {

            Employee emp = new Employee();
            emp.setEmp_name("Haider");
            emp.setEmp_address("Mars");
            EmployeeDaoImplementation empDao = new EmployeeDaoImplementation();
            // add
            empDao.add(emp);
            // read
            Employee e = empDao.getEmployee(2);
            System.out.println(e.getEmp_id() + " "
                    + e.getEmp_name() + " "
                    + e.getEmp_address());

            // read All
            List<Employee> ls = empDao.getEmployees();
            for (Employee allEmp : ls) {
                System.out.println(allEmp);
            }

            // update
            Employee tempEmployee = empDao.getEmployee(4);
            tempEmployee.setEmp_address("Asgard");
            empDao.update(tempEmployee);


    }
}
