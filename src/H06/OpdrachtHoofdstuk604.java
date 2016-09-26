package H06;

/**
 * Created by mustafa on 22-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class OpdrachtHoofdstuk604 extends Applet{
    double gemiddelde;
    double uitkomst;
    int uitkomst2;

    public void init(){
        gemiddelde=(5.9+6.3+6.9)/3;
        uitkomst=gemiddelde*10;
        uitkomst2=(int)uitkomst;
    }

    public void paint(Graphics g){

        g.drawString("Het gemiddelde is: "+(double)uitkomst2/10 ,50,50);
    }
}
