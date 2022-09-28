package condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

//    @Bean
//    public Test1 test1(){
//        return new Test1();
//    }

    @Bean
    @Conditional(TestCondition.class)
    public Test2 test2(){
        return new Test2();
    }

}
