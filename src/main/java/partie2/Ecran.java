package partie2;

import org.springframework.stereotype.Component;

@Component("Ecran")
public class Ecran implements VGA {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
