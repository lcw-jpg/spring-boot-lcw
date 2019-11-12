package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("spring-dubbo-consumer.xml")
public class SpringbootDobbu1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDobbu1Application.class, args);
    }

}
