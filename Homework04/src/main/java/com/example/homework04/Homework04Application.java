package com.example.homework04;

import com.example.homework04.aop.ExecuteTime;
import com.example.homework04.method.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Homework04Application {

    @ExecuteTime
    public static void main(String[] args) {
        SpringApplication.run(Homework04Application.class, args);
    }

}
