package org.example.terms;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(1)
public class LogAspect {

    //@Before("execution(* *(..))")//any type any method any parameters
    //@Before("execution(public void doSomeThing())")

    @Pointcut("execution(public * doSomeThing(..))")   // can be used now for multiple ones
    private void ForDoSomeThing(){}


    @Before("ForDoSomeThing()")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("log before method is executed "+joinPoint.getSignature().getName());
    }
    @AfterReturning(
            pointcut = "execution(public * org.example.terms.CustomerServiceImpl.doSomeThing(..))",
            returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, List<String> result){
        for(Object res:result){
            System.out.println(res);
        }
    }

    @AfterThrowing(pointcut = "execution(public * org.example.terms.CustomerServiceImpl.doSomeThing(..))",
                throwing = "theExc")
    public void logAfterException(JoinPoint joinPoint,Throwable theExc){

        System.out.println("the exception "+theExc);

    }

    @After("execution(* *(..))")    //will be always run before AfterThrowing
    public void logAfter(){
        System.out.println("log after method ");
    }

}
