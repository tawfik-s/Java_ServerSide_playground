package org.example.terms;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements  CustomerService{

    public List<String> doSomeThing(String name){
        System.out.println("do some thing in customer service Implementation  your name is "+name);
        List<String> things=new ArrayList<String>();
        things.add("phone");
        things.add("mobile phone");
        things.add("car");
        things.add("casioWatch");
        return things;
    }
}
