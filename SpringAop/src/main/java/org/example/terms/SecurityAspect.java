package org.example.terms;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)  //order the Aspects
public class SecurityAspect {


    @Before("execution(public void doSomeThing(..))")
    public void logBefore(JoinPoint joinPoint){

        MethodSignature methodSignature=(MethodSignature) joinPoint.getSignature();
        System.out.println("check security here "+methodSignature.getName());

        Object args[]=joinPoint.getArgs();

        for(Object x:args){
            System.out.println(x);

            if(x instanceof String){
                System.out.println("String "+ x);
            }

        }

    }
}
