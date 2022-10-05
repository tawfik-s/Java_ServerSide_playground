package org.example.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(MyAppConfig.class);
        SMSService smsService=(SMSService) context.getBean("SMSService");
        smsService.sendMessage("t.shalash1@gmail.com","Hi..");

    }
}
