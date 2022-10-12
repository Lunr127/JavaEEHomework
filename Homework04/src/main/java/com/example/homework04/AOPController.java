package com.example.homework04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aop")
public class AOPController {

    @Autowired
    private AOPService aopService;

    @GetMapping("/testHelloAop")
    public String testHelloAop(@RequestParam String param){
        String result= aopService.helloAop(param);
        return result;
    }


}
