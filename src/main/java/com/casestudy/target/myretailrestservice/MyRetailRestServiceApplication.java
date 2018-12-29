package com.casestudy.target.myretailrestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class MyRetailRestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyRetailRestServiceApplication.class, args);
    }

}

