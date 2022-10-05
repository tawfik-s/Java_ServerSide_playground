package org.example.annotation;


import org.springframework.stereotype.Component;

@Component
public class SMSService {

    public void sendMessage(String receiver,String message){
        System.out.println(message +" is being sent to "+receiver+ " by text message ....");

    }
}
