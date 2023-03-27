package partie1.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import partie1.metier.IMetier;

public class SpringXML {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        IMetier metier = applicationContext.getBean(IMetier.class);
        double result = metier.calcul();
        System.out.println("iMetier.calcul(): "+result);
    }
}
