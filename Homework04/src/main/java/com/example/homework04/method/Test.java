package com.example.homework04.method;


import com.example.homework04.aop.ExecuteTime;

public class Test {

    @ExecuteTime
    public static void TestMethod(){
        System.out.println("this is a test method");
    }

}
