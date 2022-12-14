package com.example.homework04.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.NamedThreadLocal;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
@Slf4j
public class ExecuteTimeAspect {
    private static final ThreadLocal<Long> beginTimeThreadLocal = new NamedThreadLocal<>("ThreadLocal beginTime");
    @Pointcut("@annotation(ExecuteTime)")
    private void pointCut(){

    }

    @Before("pointCut()")
    public void doBefore(JoinPoint joinPoint) throws InterruptedException{
        System.out.println("aop begin");
        beginTimeThreadLocal.set(System.currentTimeMillis());
        System.out.println("before 时间为：" + System.currentTimeMillis());

    }

    @After("pointCut()")
    public void after(){
        Long executeTime=System.currentTimeMillis()-beginTimeThreadLocal.get();
        System.out.println("after 时间为：" + System.currentTimeMillis());
        System.out.println("执行时间为："+executeTime);
    }
}
