package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
@Scope("prototype")   //not keep a reference so it's not destroyed if it's prototype
public class Destroy implements DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean ..destroy");
    }

    @PreDestroy
    public void predDestroy() throws Exception{
        System.out.println("pre dextroy");
    }
}