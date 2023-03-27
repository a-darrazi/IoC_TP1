package partie2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("HdmiVgaAdapter")
public class HdmiVgaAdapter implements VGA{
    @Autowired
    private HDMI hdmi;
    @Override
    public void print(String message) {
        hdmi.print(message.getBytes());
    }
}
