package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerService {
    //@Autowired(required = false)
    @Autowired
    @Qualifier("customerDaoImp")
    private CustomerDao customerDao;

    public CustomerService(){
        System.out.println("default constructor of CustomerService");
    }

    public CustomerService(CustomerDao customerDao){
        System.out.println("argument constructor");
        this.customerDao=customerDao;
    }
    public CustomerDao getCustomerDao(){
        return  customerDao;
    }
    //@Autowired
    public void setCustomerDao(CustomerDao customerDao){
        System.out.println("settingCustomerDao");
        this.customerDao=customerDao;
    }
}
