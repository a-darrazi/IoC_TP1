package partie2;

import org.springframework.stereotype.Component;

@Component("Sourie")
public class Sourie implements USB {
    @Override
    public int read() {
        return 5;
    }
}
