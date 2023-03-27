package partie2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("UC")
public class UC {
    @Autowired
    @Qualifier("Ecran")
    private VGA vga;
    @Autowired
    @Qualifier("Clavier")
    private USB usb;

    public int readData(){
        return usb.read();
    }

    public void printData(String s){
        vga.print(s);
    }

}
