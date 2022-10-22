package org.example.terms;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Before("execution(* *(..))")//any type any method any prameters
    public void logBefore(JoinPoint joinPoint){
        System.out.println("log before method is executed "+joinPoint.getSignature().getName());
    }
    @After("execution(* *(..))")
    public void logAfter(){
        System.out.println("log after method is executed");
    }
}
