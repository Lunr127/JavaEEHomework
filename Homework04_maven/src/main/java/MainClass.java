import org.springframework.context.annotation.ComponentScan;

@ComponentScan("aop")
public class MainClass {
    public static void main(String[] args) {
        Test.TestMethod();

    }
}
