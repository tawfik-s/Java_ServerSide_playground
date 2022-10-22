package org.example.terms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
        CustomerService customerService=context.getBean(CustomerService.class);
        customerService.doSomeThing();

    }
}
