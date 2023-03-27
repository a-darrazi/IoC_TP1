package partie2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("partie2")
public class ComputerApplication{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComputerApplication.class);

        UC uc = context.getBean(UC.class);
        System.out.println(uc.readData());
        uc.printData("hello");
    }
}
