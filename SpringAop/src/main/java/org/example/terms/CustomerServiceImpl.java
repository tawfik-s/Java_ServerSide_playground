package org.example.terms;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements  CustomerService{

    public void doSomeThing(){
        System.out.println("do some thing in customer service Implementation");
    }
}
