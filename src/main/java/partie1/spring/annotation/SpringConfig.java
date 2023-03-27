package partie1.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import partie1.metier.IDao;
import partie1.metier.IDaoImpl;
import partie1.metier.IMetier;
import partie1.metier.IMetierImpl;

@Configuration
@ComponentScan("partie1")
public class SpringConfig {

    @Bean
    public IDao getIDao(){
        return new IDaoImpl();
    }

    @Bean
    public IMetier getIMetier(){
        return new IMetierImpl(getIDao());
    }

}
