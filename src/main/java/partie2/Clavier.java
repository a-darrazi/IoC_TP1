package partie2;

import org.springframework.stereotype.Component;

@Component("Clavier")
public class Clavier implements USB {
    @Override
    public int read() {
        return 10;
    }
}
