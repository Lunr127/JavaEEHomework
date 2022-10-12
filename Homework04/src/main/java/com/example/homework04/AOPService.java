package com.example.homework04;

import com.example.homework04.aop.ExecuteTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AOPService {
    @ExecuteTime
    public String helloAop(String param){
        System.out.println("hello aop test");
        return param;
    }

}
