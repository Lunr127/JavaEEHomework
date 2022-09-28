import condition.Test1;
import condition.Test2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan("condition")
public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(MainClass.class);

        String[] names = applicationContext.getBeanNamesForType(Test1.class);
        System.out.println("---Test1 bean names : " + Arrays.asList(names));
        names = applicationContext.getBeanNamesForType(Test2.class);
        System.out.println("---Test2 bean names : " + Arrays.asList(names));

        applicationContext.close();

    }
}
