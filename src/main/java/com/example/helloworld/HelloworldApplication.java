package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication {

    public static void main(String[] args) {

        System.out.println("Hello git");
        System.out.println("Hello git3 ");
        System.out.println("Hello git4 ");
        System.out.println("master test ");

        System.out.println("hot-fix ");
        System.out.println("push test");
        System.out.println("pull test");        
        SpringApplication.run(HelloworldApplication.class, args);
    }

}
