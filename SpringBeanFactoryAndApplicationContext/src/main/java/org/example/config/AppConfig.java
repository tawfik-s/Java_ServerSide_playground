package org.example.config;

import org.example.TriangleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
@Component("drawTriangle")
public class AppConfig {

    @Bean
    public TriangleService triangleService(){
        return new TriangleService();
    }

    @Bean
    @Scope("prototype")
    public TriangleService prototypeTriangleService(){
        return new TriangleService();
    }
}
