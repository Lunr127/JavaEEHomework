import aop.ExecuteTime;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("aop")
public class Test {

    @ExecuteTime
    public static void TestMethod(){
        System.out.println("this is a test method");
    }

}
