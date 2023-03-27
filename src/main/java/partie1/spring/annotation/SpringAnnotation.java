package partie1.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import partie1.metier.IMetier;

public class SpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);


        IMetier metier = applicationContext.getBean(IMetier.class);
        double result = metier.calcul();
        System.out.println("iMetier.calcul(): "+result);
    }
}
