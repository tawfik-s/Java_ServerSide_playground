package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Customer implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {
    private String FirstName;

    public Customer(){
        System.out.println("Customer non argument constructor.....");
    }
    public Customer(String FirstName){
        System.out.println("Customer firstname constructor arguments "+FirstName);
        this.FirstName=FirstName;
    }

    public String getFirstName(){
        return FirstName;
    }
    public void setFirstName(String FirstName){
        System.out.println("set first name .."+FirstName);
        this.FirstName=FirstName;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName "+s);
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory"+ beanFactory.isSingleton("customer"));

    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext "+ applicationContext.isPrototype("customer"));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initializing bean afterPropertiesSet ");
    }
}
