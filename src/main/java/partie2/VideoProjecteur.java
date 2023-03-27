package partie2;

import org.springframework.stereotype.Component;

@Component("VideoProjecteur")
public class VideoProjecteur implements VGA {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
