package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String [] args){
        //        BeanFactory factory=new ClassPathXmlApplicationContext("spring.xml");
//        Triangle triangle=(Triangle) factory.getBean("triangle");
//        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//        TriangleService triangle=(TriangleService) context.getBean("triangle");
//        triangle.draw();

        //Singleton

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        TriangleService triangleService1=context.getBean("triangleService",TriangleService.class);
        triangleService1.draw();
        System.out.println(triangleService1);
        TriangleService triangleService2=context.getBean("triangleService",TriangleService.class);
        triangleService2.draw();
        System.out.println(triangleService2);

        //Prototype

        TriangleService triangleService3=context.getBean("prototypeTriangleService",TriangleService.class);
        triangleService3.draw();
        System.out.println(triangleService3);
        TriangleService triangleService4=context.getBean("prototypeTriangleService",TriangleService.class);
        triangleService4.draw();
        System.out.println(triangleService4);

    }
}
