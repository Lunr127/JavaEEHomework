package com.example.homework02;

import com.example.homework02.entity.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Homework02Application {

    public static void main(String[] args) throws Exception {
//        SpringApplication.run(Homework02Application.class, args);
        LenovoComputer lenovoComputer = LenovoComputer.getInstance();

    }

}
