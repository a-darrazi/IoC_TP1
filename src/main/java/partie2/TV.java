package partie2;

import org.springframework.stereotype.Component;

@Component("TV")
public class TV implements HDMI {
    @Override
    public void print(byte[] data) {
        System.out.println(new String(data));
    }
}
