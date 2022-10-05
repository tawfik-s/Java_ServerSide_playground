package org.example.models;
public class Employee {

    int emp_id;
    String emp_name;
    String emp_address;

    public Employee() {}

    public Employee(String emp_name, String emp_address)
    {
        this.emp_name = emp_name;
        this.emp_address = emp_address;
    }

    public int getEmp_id()
    {
        return emp_id;
    }

    public void setEmp_id(int emp_id)
    {
        this.emp_id = emp_id;
    }

    public String getEmp_name()
    {
        return emp_name;
    }

    public void setEmp_name(String emp_name)
    {
        this.emp_name = emp_name;
    }

    public String getEmp_address()
    {
        return emp_address;
    }

    public void setEmp_address(String emp_address)
    {
        this.emp_address = emp_address;
    }

    @Override
    public String toString()
    {
        return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_address=" + emp_address + "]";
    }
}
