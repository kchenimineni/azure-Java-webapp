package com.sample.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StudentApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(StudentApplication.class, args);
        // System.out.println(ctx);
    }
}