package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.NamedThreadLocal;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecuteTimeAspect {
    private static final ThreadLocal<Long> beginTimeThreadLocal = new NamedThreadLocal<>("ThreadLocal beginTime");

    //切点:决定用注解方式的方法切还是针对某个路径下的所有类和方法进行切，方法必须是返回void类型
    @Pointcut("@annotation(aop.ExecuteTime)")
    private void pointCut(){

    }

    /**
     * 前置通知 (在方法执行之前返回)用于拦截Controller层记录用户的操作的开始时间
     * @param joinPoint 切点
     */
    @Before("pointCut()")
    public void doBefore(JoinPoint joinPoint) throws InterruptedException{
        System.out.println("begin");
        beginTimeThreadLocal.set(System.currentTimeMillis());
    }


    /**
     * 后置通知(在方法执行之后并返回数据) 用于拦截Controller层无异常的操作
     */
    @After("pointCut()")
    public void after(){
        Long executeTime=System.currentTimeMillis()-beginTimeThreadLocal.get();
        System.out.println("执行时间为："+executeTime);
    }
}
